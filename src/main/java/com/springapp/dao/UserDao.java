package com.springapp.dao;

import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
@Repository
public interface UserDao {

    // 根据token查找用户
    GbtbUserInfoEntity getUserByToken(String token);

    // 查询手机号是否已被注册
    Integer getUserByPhone(String phone);

    // 注册新用户
    Integer signIn(GbtbUserInfoEntity userInfoEntity);

    // 用户登录
    String login(String phone, String pwd);
}
