package com.springapp.dao;

import com.springapp.entity.Condition;
import com.springapp.entity.GbtbProductInfoEntity;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuoyangzong on 15/4/30.
 */
@Component
public class ListDaoImpl extends GeneralDaoImpl implements ListDao {

    @Override
    public List<GbtbProductInfoEntity> getProductList(Condition condition) {

        Session session = getSession();
        try {

            Criteria cr = session.createCriteria(GbtbProductInfoEntity.class);

            cr.add(Restrictions.eq("salary", 2000));

            StringBuffer strQuery = new StringBuffer();
            strQuery.append("select * from gbtb_product_info where product_region = ").append(condition.getRegion());
            strQuery.append(" and product_price = ").append(condition.getPrice());
            if (condition.getCategory() != null && condition.getCategory().length() > 0) {
                strQuery.append(" and product_category = ").append(condition.getCategory());
            }
            if (condition.getKeyWord() != null && condition.getKeyWord().length() > 0) {
                strQuery.append(" and product_name like '%").append(condition.getKeyWord().replace(' ', '%')).append("%'");
            }

            SQLQuery q = session.createSQLQuery(strQuery.toString());

            List<GbtbProductInfoEntity> result = new ArrayList<GbtbProductInfoEntity>();

            result = q.addEntity(GbtbProductInfoEntity.class).list();

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
