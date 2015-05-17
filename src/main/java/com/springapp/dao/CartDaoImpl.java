package com.springapp.dao;

import com.springapp.common.CONST;
import com.springapp.entity.GbtbCartEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 * Created by zhuoyangzong on 15/5/17.
 */
@Component
public class CartDaoImpl extends GeneralDaoImpl implements CartDao {

    @Override
    public Integer addToCart(GbtbCartEntity cartEntity) {

        Session session = getSession();

        Transaction tran = session.beginTransaction();

        try {

            session.save(cartEntity);

            tran.commit();

        } catch (Exception e) {

            // 数据库连接失败
            tran.rollback();
            e.printStackTrace();
            return CONST.DB_ERROR;

        } finally {

            session.close();
        }

        return cartEntity.getId();
    }
}
