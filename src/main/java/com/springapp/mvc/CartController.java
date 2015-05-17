package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.CookieUtil;
import com.springapp.dao.CartDao;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbCartEntity;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/17.
 */
@Service
@RequestMapping("/cart*")
public class CartController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    UserDao userDao;

    @Autowired
    CartDao cartDao;

    @RequestMapping(method = RequestMethod.GET)
    public String getCart(ModelMap model) {

        // 获取登录信息
        Cookie tokenCookie = CookieUtil.getCookieByName(request, CONST.USER_TOKEN);
        // 根据token获取用户信息
        if (null != tokenCookie) {
            GbtbUserInfoEntity user = userDao.getUserByToken(tokenCookie.getValue());

            if (null == user) {
                // TODO 数据库连接失败
            } else {
                // 获取用户的购物车列表
                List<GbtbCartEntity> cart1 = cartDao.getCartList(user.getId(), 399);
                List<GbtbCartEntity> cart2 = cartDao.getCartList(user.getId(), 699);

                if (cart1 == null || cart2 == null) {
                    // TODO 数据库连接失败
                } else {
                    // 将两档购物车返回页面
                    model.addAttribute("cart1", cart1);
                    model.addAttribute("cart2", cart2);

                    return "cart";
                }
            }
        } else {
            // 用户未登录
            model.addAttribute("redirect", "cart");
            return "redirect:login";
        }
        // TODO 临时的return
        return "";
    }
}
