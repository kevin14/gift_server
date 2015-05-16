package com.springapp.mvc;

import com.springapp.common.CookieUtil;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbProductInfoEntity;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
@Service
@RequestMapping("/home*")
public class HomeController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model, HttpServletResponse response) {

        // TODO 提取成共同方法，获取用户
        // 获取登录信息
        Cookie tokenCookie = CookieUtil.getCookieByName(request, "userToken");
        // 根据token获取用户信息
        if (null != tokenCookie) {
            GbtbUserInfoEntity user = userDao.getUserByToken(tokenCookie.getValue());

            if (null == user) {
                // TODO 获取失败，报错
            } else {
                // 更新登录信息
                model.addAttribute("user", user);
            }
        }



        System.out.println(CookieUtil.getCookieByName(request, "userToken").getValue());

        //Integer pid = Integer.parseInt(request.getParameter("pid"));

        //GbtbProductInfoEntity productDetail = detailDao.getProductDetail(pid);

        //model.addAttribute("productDetail", productDetail);

        //Cookie cookie = new Cookie("userToken","abcdefg");

        //response.addCookie(cookie);

        return "home";
    }
}
