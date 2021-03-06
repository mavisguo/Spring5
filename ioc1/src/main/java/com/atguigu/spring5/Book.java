package com.atguigu.spring5;

/**
 * 使用set方法注入属性
 */
public class Book {

    //创建属性
    private String name;
    private String author;
    private String address;

    //创建属性对应的set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void bookTest() {
        System.out.println(name + "::" + author + "::" + address);
    }

}
