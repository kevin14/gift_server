package com.springapp.dao;

import com.springapp.common.CONST;
import com.springapp.entity.GbtbTradeRecordEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 * Created by zhuoyangzong on 15/5/23.
 */
@Component
public class OrderDaoImpl extends GeneralDaoImpl implements OrderDao {

    @Override
    public Integer createOrder(GbtbTradeRecordEntity tradeRecordEntity) {

        Session session = getSession();

        Transaction tran = session.beginTransaction();

        try {

            session.save(tradeRecordEntity);

            tran.commit();

        } catch (Exception e) {

            // 数据库连接失败
            tran.rollback();
            e.printStackTrace();
            return CONST.DB_ERROR;

        } finally {

            session.close();
        }

        return tradeRecordEntity.getId();
    }
}
