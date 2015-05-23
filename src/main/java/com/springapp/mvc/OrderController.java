package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.CookieUtil;
import com.springapp.common.Util;
import com.springapp.dao.OrderDao;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbTradeRecordEntity;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by zhuoyangzong on 15/5/18.
 */
@Service
@RequestMapping("/order*")
public class OrderController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    UserDao userDao;

    @Autowired
    OrderDao orderDao;

    @RequestMapping(method = RequestMethod.GET)
    public String order(ModelMap model) {
        return "order";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createOrder(GbtbTradeRecordEntity tradeRecordEntity, Model model) {

        // 获取登录信息
        Cookie tokenCookie = CookieUtil.getCookieByName(request, CONST.USER_TOKEN);

        // 根据token获取用户信息
        if (null != tokenCookie) {

            GbtbUserInfoEntity user = userDao.getUserByToken(tokenCookie.getValue());

            if (null == user) {
                // TODO 数据库连接失败
                return "error";
            } else {

                // 获取提交时的时间戳
                Timestamp ts = new Timestamp(new Date().getTime());

                // 生成提取码
                String fetchCode = Util.createCodeFromTS(ts);

                // 创建订单
                tradeRecordEntity.setRecordId(String.valueOf(ts.getTime()));
                tradeRecordEntity.setFetchCode(fetchCode);
                tradeRecordEntity.setUserId(user.getId());
                tradeRecordEntity.setOrderStatus(CONST.ORDER_NEW);
                tradeRecordEntity.setCreateAt(ts);
                tradeRecordEntity.setUpdateAt(ts);

                if (CONST.DB_ERROR == orderDao.createOrder(tradeRecordEntity)) {
                    // TODO 数据库连接失败
                    return "error";
                } else {

                    // TODO 跳转支付
                    return "pay";
                }
            }
        } else {

            // 用户未登录
            model.addAttribute("redirect", "order");
            return "redirect:login";
        }
    }
}
