package com.springapp.mvc;

import com.springapp.common.CONST;
import com.springapp.common.MD5Util;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
@Service
@RequestMapping("")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signIn(ModelMap model) {
        return "signin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logIn(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String signIn(ModelMap model, HttpServletResponse response) {

        // 获取注册信息
        String phone = request.getParameter("phone");
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        // 获取公钥
        String key = ResourceBundle.getBundle("property", Locale.CHINA).getString("publicKey");

        // 验证是否被注册
        Integer count = userDao.getUserByPhone(phone);

        if (0 != count) {
            // TODO 手机号已被注册
            return "redirect:home";
        } else {
            GbtbUserInfoEntity userInfoEntity = new GbtbUserInfoEntity();
            userInfoEntity.setLoginId(phone);
            userInfoEntity.setUserName(name);
            userInfoEntity.setEmail(mail);
            userInfoEntity.setLoginPwd(password);

            String token = MD5Util.convertMd5(phone + key);
            userInfoEntity.setLoginToken(token);

            userInfoEntity.setCreateAt(new Timestamp(new Date().getTime()));
            userInfoEntity.setUpdateAt(new Timestamp(new Date().getTime()));

            if (CONST.DB_ERROR != userDao.signIn(userInfoEntity)) {

                // 注册成功，把生成的token写入cookie，并跳转首页
                Cookie cookie = new Cookie(CONST.USER_TOKEN, token);
                response.addCookie(cookie);

                return "redirect:home";
            } else {
                // TODO 数据路连接失败
                return "error";
            }
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logIn(ModelMap model, HttpServletResponse response) {

        // 获取登录信息
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("password");

        String token = userDao.login(phone, pwd);

        if (null == token) {
            // TODO 数据路连接失败
            return "error";
        } else if ("".equals(token)) {
            // TODO 用户名或密码错误
            return "warning";
        } else {
            // 登录成功，把生成的token写入cookie，并跳转首页
            Cookie cookie = new Cookie(CONST.USER_TOKEN, token);
            response.addCookie(cookie);

            return "redirect:home";
        }
    }
}
