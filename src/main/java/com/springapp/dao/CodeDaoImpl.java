package com.springapp.dao;

import com.springapp.entity.GbtbCodeEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuoyangzong on 15/5/23.
 */
@Component
public class CodeDaoImpl extends GeneralDaoImpl implements CodeDao {

    @Override
    public List<GbtbCodeEntity> getCodeList(String code) {

        Session session = getSession();

        try {

            List<GbtbCodeEntity> result = new ArrayList<GbtbCodeEntity>();

            SQLQuery q = session.createSQLQuery("select * from gbtb_code c where c.code_name = :code");

            q.setParameter("code", code);

            result = q.addEntity(GbtbCodeEntity.class).list();

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
