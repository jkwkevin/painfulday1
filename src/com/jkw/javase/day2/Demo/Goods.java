package com.jkw.javase.day2.Demo;

public class Goods {
    private String name;
    private int price;

    public Goods() {
    }

    public Goods(String name,  int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void show(){
        System.out.println("商品名称:"+name);
        System.out.println("商品价格:"+price);
    }
}

