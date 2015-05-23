package com.springapp.dao;

import com.springapp.entity.GbtbTradeRecordEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/23.
 */
@Repository
public interface OrderDao {

    // 创建订单
    public Integer createOrder(GbtbTradeRecordEntity tradeRecordEntity);
}
