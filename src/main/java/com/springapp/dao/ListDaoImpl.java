package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuoyangzong on 15/4/30.
 */
@Component
public class ListDaoImpl extends GeneralDaoImpl implements ListDao {

    @Override
    public List<GbtbProductInfoEntity> getProductList() {

        Session session = getSession();
        try {

            Query q = session.createQuery(" from GbtbProductInfoEntity ");

            List<GbtbProductInfoEntity> result = new ArrayList<GbtbProductInfoEntity>();

            result = q.list();

            return result;

        } finally {
            session.close();
        }
    }
}
