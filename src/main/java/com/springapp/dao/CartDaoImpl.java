package com.springapp.dao;

import com.springapp.common.CONST;
import com.springapp.entity.GbtbCartEntity;
import org.hibernate.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<GbtbCartEntity> getCartList(Integer userId, Integer price) {

        Session session = getSession();

        try {

            List<GbtbCartEntity> result = new ArrayList<GbtbCartEntity>();

            SQLQuery q = session.createSQLQuery("select * from gbtb_cart c inner join gbtb_product_info p on (c.product_id = p.id and p.product_price = :price) where c.user_id = :userId");

            q.setParameter("price", price);
            q.setParameter("userId", userId);

            result = q.addEntity(GbtbCartEntity.class).list();

            return result;

        } catch (Exception e) {

            // 数据库连接失败
            e.printStackTrace();
            return null;

        } finally {
            session.close();
        }
    }
}
