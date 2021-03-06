package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里面value属性值可以省略不写，默认值是类名称，首字母小写
//@Component(value = "userService")//<bean id="userService" class="com.atguigu.spring5.service.UserService"/>
@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    //定义Dao类型属性，不需要添加set方法，添加属性注入注解
//    @Autowired//根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")//根据名称进行注入
//    private UserDao userDao;

    //@Resource//根据类型进行注入
    @Resource(name = "userDaoImpl1")//根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("Service add..." + name);
        userDao.add();
    }

}
