package com.springapp.dao;

import com.springapp.entity.GbtbCartEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/17.
 */
@Repository
public interface CartDao {

    // 插入购物车
    Integer addToCart(GbtbCartEntity cartEntity);

    // 根据用户和价位获取购物车列
    List<GbtbCartEntity> getCartList(Integer userId, Integer price);
}
