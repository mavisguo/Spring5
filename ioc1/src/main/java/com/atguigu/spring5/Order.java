package com.atguigu.spring5;

/**
 * 使用有参构造器注入属性
 */
public class Order {

    //属性
    private String name;
    private String address;

    //有参构造器
    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void orderTest() {
        System.out.println(name + "::" + address);
    }

}
