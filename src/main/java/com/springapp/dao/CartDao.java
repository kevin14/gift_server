package com.springapp.dao;

import com.springapp.entity.GbtbCartEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/17.
 */
@Repository
public interface CartDao {

    // 插入购物车
    public Integer addToCart(GbtbCartEntity cartEntity);
}
