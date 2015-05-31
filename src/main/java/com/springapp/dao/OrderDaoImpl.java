package com.springapp.dao;

import com.springapp.common.CONST;
import com.springapp.entity.GbtbTradeRecordEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

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

    @Override
    public GbtbTradeRecordEntity getByFetchCode(String fetchCode) {

        Session session = getSession();

        try {

            Query q = session.createQuery("from GbtbTradeRecordEntity where fetchCode = :fetchCode and orderStatus = :orderStatus");

            q.setParameter("fetchCode", fetchCode);
            q.setParameter("orderStatus", CONST.ORDER_PAID);

            List<GbtbTradeRecordEntity> result = q.list();

            if (result.size() > 0) {
                return result.get(0);
            } else {

                GbtbTradeRecordEntity emptyOrder = new GbtbTradeRecordEntity();

                emptyOrder.setId(0);
                return emptyOrder;
            }

        } catch (Exception e) {

            // 数据库连接失败
            e.printStackTrace();
            return null;

        } finally {

            session.close();
        }
    }
}
