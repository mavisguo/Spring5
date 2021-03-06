package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void update() {
        System.out.println("Service update...");
        userDao.update();
    }

}
