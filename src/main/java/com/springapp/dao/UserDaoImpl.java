package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import com.springapp.entity.GbtbUserInfoEntity;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
@Component
public class UserDaoImpl extends GeneralDaoImpl implements UserDao {

    @Override
    public GbtbUserInfoEntity getUserByToken(String token) {

        Session session = getSession();

        try {

            Criteria cr = session.createCriteria(GbtbUserInfoEntity.class);

            cr.add(Restrictions.eq("loginToken", token));

            List<GbtbUserInfoEntity> result = new ArrayList<GbtbUserInfoEntity>();

            result = cr.list();

            if (result.size() > 0) {
                return result.get(0);
            } else {
                return null;
            }

        } finally {
            session.close();
        }
    }

    @Override
    public Integer getUserByPhone(String phone) {

        Session session = getSession();

        Query q = session.createQuery("select count(*) as n from GbtbUserInfoEntity where loginId = :loginId");

        q.setParameter("loginId", phone);

        try {

            return Integer.parseInt(String.valueOf(q.list().get(0)));

        } finally {
            session.close();
        }
    }

    @Override
    public Integer signIn(GbtbUserInfoEntity userInfoEntity) {

        Session session = getSession();

        Transaction tran = session.beginTransaction();

        try {

            session.save(userInfoEntity);

        } finally {

            tran.commit();
            session.close();
        }

        return userInfoEntity.getId();
    }
}
