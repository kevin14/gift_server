package com.springapp.dao;

import com.springapp.entity.GbtbUserInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
@Repository
public interface UserDao {

    // 根据token查找用户
    public GbtbUserInfoEntity getUserByToken(String token);
}
