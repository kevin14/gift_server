package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.CookieUtil;
import com.springapp.dao.UserDao;
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
@RequestMapping("")
public class HomeController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model, HttpServletResponse response) {

        // TODO 提取成共同方法，获取用户
        // 获取登录信息
        Cookie tokenCookie = CookieUtil.getCookieByName(request, CONST.USER_TOKEN);
        // 根据token获取用户信息
        if (null != tokenCookie) {
            GbtbUserInfoEntity user = userDao.getUserByToken(tokenCookie.getValue());

            if (null == user) {
                // TODO 数据库连接失败
            } else {
                // 更新登录信息
                model.addAttribute("user", user);
            }
        }

        return "home";
    }

    @RequestMapping(value = "/home*", method = RequestMethod.GET)
    public String home(ModelMap model, HttpServletResponse response) {
        return welcome(model, response);
    }
}
