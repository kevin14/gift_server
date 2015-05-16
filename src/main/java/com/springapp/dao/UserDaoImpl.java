package com.springapp.dao;

import com.springapp.common.CONST;
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

            return result.get(0);

        } catch (Exception e) {

            // 数据库连接失败
            e.printStackTrace();
            return null;

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

        } catch (Exception e) {

            // 数据库连接失败
            e.printStackTrace();
            return CONST.DB_ERROR;

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

            tran.commit();

        } catch (Exception e) {

            // 数据库连接失败
            tran.rollback();
            e.printStackTrace();
            return CONST.DB_ERROR;

        } finally {

            session.close();
        }

        return userInfoEntity.getId();
    }

    @Override
    public String login(String phone, String pwd) {

        Session session = getSession();

        Query q = session.createQuery("from GbtbUserInfoEntity where loginId = :loginId and loginPwd = :loginPwd");

        q.setParameter("loginId", phone);
        q.setParameter("loginPwd", pwd);

        List<GbtbUserInfoEntity> result = new ArrayList<GbtbUserInfoEntity>();

        try {

            result = q.list();

            if (result.size() == 0) {
                // 用户不存在
                return "";
            } else {
                // 返回用户token
                return result.get(0).getLoginToken();
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
