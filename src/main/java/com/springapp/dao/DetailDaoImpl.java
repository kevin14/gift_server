package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
@Component
public class DetailDaoImpl extends GeneralDaoImpl implements DetailDao {

    @Override
    public GbtbProductInfoEntity getProductDetail(Integer pid) {

        Session session = getSession();
        try {

            GbtbProductInfoEntity result = new GbtbProductInfoEntity();

            result = (GbtbProductInfoEntity) session.get(GbtbProductInfoEntity.class, pid);

            return result;

        } finally {
            session.close();
        }
    }
}
