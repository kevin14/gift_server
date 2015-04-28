package com.springapp.dao;

import com.springapp.entity.GbtbProductInfoEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by kevin14 on 15/4/28.
 */
@Component
public class ListDao {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public GbtbProductInfoEntity getProduct() {

        Session session = getSession();
        try{
            session.beginTransaction();

            Query q = session.createQuery("from GbtbProductInfoEntity");

            //GbtbProductInfoEntity result = (GbtbProductInfoEntity)session.get(GbtbProductInfoEntity.class, 1);

            return (GbtbProductInfoEntity)q.list().get(0);

        } finally {
            session.close();
        }
    }
}
