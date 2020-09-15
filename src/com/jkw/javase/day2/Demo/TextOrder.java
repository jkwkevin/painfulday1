package com.jkw.javase.day2.Demo;

public class TextOrder {
    public static void main(String[] args) {
        Goods g1 = new Goods("毛巾",15);
        Goods g2 = new Goods("肥皂",3);
        Goods[] goods = {g1,g2};
        Order order = new Order(goods);
        Users users1 = new Users("张三","001");
        users1.downorder(order);

    }
}
