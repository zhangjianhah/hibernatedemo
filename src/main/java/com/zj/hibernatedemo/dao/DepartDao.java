package com.zj.hibernatedemo.dao;


import com.zj.hibernatedemo.entity.Depart;
import com.zj.hibernatedemo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartDao extends BaseDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Depart findById(){
        return null;
    }

    public void insertDepart (Depart depart) throws Exception {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(depart);

        getSession().save(depart);

    }

}
