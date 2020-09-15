package com.jkw.javase.day2.Demo;

public class Goods {
    private String name;
    private String num;
    private int price;

    public Goods() {
    }

    public Goods(String name, String num, int price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void show(){
        System.out.println("商品名称:"+name);
        System.out.println("商品货号:"+num);
        System.out.println("商品价格:"+price);
    }
}

