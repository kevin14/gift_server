package com.springapp.mvc;

import com.springapp.common.MD5Util;
import com.springapp.dao.UserDao;
import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
@RequestMapping("/signin")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(method = RequestMethod.POST)
    public String signin(ModelMap model, HttpServletResponse response) {

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
            return "warning";
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

            userDao.signIn(userInfoEntity);

            Cookie cookie = new Cookie("userToken", token);
            response.addCookie(cookie);

            return "home";
        }
    }
}
