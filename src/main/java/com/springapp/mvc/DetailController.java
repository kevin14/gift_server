package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.CookieUtil;
import com.springapp.dao.CartDao;
import com.springapp.dao.DetailDao;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbCartEntity;
import com.springapp.entity.GbtbProductInfoEntity;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
@Service
@RequestMapping("/detail*")
public class DetailController {

    @Autowired
    public DetailDao detailDao;

    @Autowired
    public UserDao userDao;

    @Autowired
    public CartDao cartDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        Integer pid = Integer.parseInt(request.getParameter("pid"));

        GbtbProductInfoEntity productDetail = detailDao.getProductDetail(pid);

        model.addAttribute("productDetail", productDetail);

        return "detail";
    }

    @ResponseBody
    @RequestMapping(value = "addToCart", method = RequestMethod.POST)
    public String addToCart(@RequestBody String productId) {

        // 获取登录信息
        Cookie tokenCookie = CookieUtil.getCookieByName(request, CONST.USER_TOKEN);

        // 根据token获取用户信息
        if (null != tokenCookie) {
            GbtbUserInfoEntity user = userDao.getUserByToken(tokenCookie.getValue());

            if (null == user) {
                // TODO 数据库连接失败
            } else {
                // 插入购物车
                GbtbCartEntity cartEntity = new GbtbCartEntity();

                cartEntity.setUserId(user.getId());
                cartEntity.setProductId(Integer.parseInt(productId));
                cartEntity.setCreateAt(new Timestamp(new Date().getTime()));
                cartEntity.setUpdateAt(new Timestamp(new Date().getTime()));

                if (CONST.DB_ERROR == cartDao.addToCart(cartEntity)) {
                    // TODO 数据库连接失败
                } else {
                    return CONST.SUCCESS;
                }
            }
        }
        return CONST.FAILURE;
    }
}
