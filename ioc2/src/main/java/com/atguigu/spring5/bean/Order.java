package com.atguigu.spring5.bean;

public class Order {

    //无参构造器
    public Order() {
        System.out.println("第一步 执行无参构造器创建bean实例");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用set方法设置属性值");
    }

    //创建执行初始化的方法
    public void initMethod() {
        System.out.println("第三步 执行初始化的方法");
    }

    //创建执行销毁的方法
    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }

}
