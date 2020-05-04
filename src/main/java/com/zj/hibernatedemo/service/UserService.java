package com.zj.hibernatedemo.service;

import com.zj.hibernatedemo.dao.DepartDao;
import com.zj.hibernatedemo.dao.UserDao;
import com.zj.hibernatedemo.entity.Depart;
import com.zj.hibernatedemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private DepartDao departDao;

//    @Transactional
    public void insertUser() throws Exception {





        User user = new User();
        user.setAccount("zj");
        user.setPwd("11");
        user.setRealName("zhangjian");
        user.setCreateTime(new Date());
        user.setDelflg((short)1);

        userDao.insertUser(user);
    }


    public void moreUser() throws Exception {




        try {
            Depart depart = new Depart();
            depart.setName("renshi");
            depart.setCreateTime(new Date());
            departDao.insertDepart(depart);

            int a = 1/0;


            User user = new User();
            user.setAccount("zj");
            user.setPwd("11");
            user.setRealName("zhangjian");
            user.setCreateTime(new Date());
            user.setDelflg((short)1);
            user.setDepart(depart);


            userDao.insertUser(user);
        }catch (Exception e){
            throw new RuntimeException();
        }





    }



}
