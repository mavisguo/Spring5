package com.atguigu.spring5.test;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc1 {

    @Test
    public void testUser() {
        //1 加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.userTest();
    }

    @Test
    public void testBook() {
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.bookTest();
    }

    @Test
    public void testOrder() {
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Order order = context.getBean("order", Order.class);

        System.out.println(order);
        order.orderTest();
    }

    @Test
    public void testUserService() {
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.update();
    }

    @Test
    public void testEmp() {
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.test();
    }

}
