package com.zj.hibernatedemo.controller;


import com.zj.hibernatedemo.dao.UserDao;
import com.zj.hibernatedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class DemoController {


    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/test")
    public String test(){

        try {
            userService.insertUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "okm";
    }

    @RequestMapping(value = "/add")
    public String add(){
        try {
            userService.moreUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "okm";
    }
}
