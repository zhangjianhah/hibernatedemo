package com.zj.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BaseDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
