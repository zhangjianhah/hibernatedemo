package com.zj.hibernatedemo.dao;

import com.zj.hibernatedemo.entity.Depart;
import com.zj.hibernatedemo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao extends BaseDao {

    @Autowired
    SessionFactory sessionFactory;


    public void insertUser (User user) throws RuntimeException,Exception {
        try {
            Depart depart = new Depart();
            depart.setName("renshi");
            depart.setCreateTime(new Date());
            getSession().save(depart);
            int i = 1/0;


            //通过OpenSession开启的线程，要手动添加事务
//        Session session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(user);
//        tx.commit();
//        session.close();


//        Session session = sessionFactory.getCurrentSession();
//        session.save(user);


            getSession().save(user);


            //sessionFactory.openSession().save(user);
            //sessionFactory.openSession().save(user);
            //sessionFactory.getCurrentSession().save(user);
        }catch (Exception e){
            throw new RuntimeException();
        }










    }
}
