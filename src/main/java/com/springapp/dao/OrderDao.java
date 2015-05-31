package com.springapp.dao;

import com.springapp.entity.GbtbTradeRecordEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuoyangzong on 15/5/23.
 */
@Repository
public interface OrderDao {

    // 创建订单
    Integer createOrder(GbtbTradeRecordEntity tradeRecordEntity);

    // 根据提取码查找订单
    GbtbTradeRecordEntity getByFetchCode(String fetchCode);
}
