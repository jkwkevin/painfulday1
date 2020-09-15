package com.jkw.javase.day2.Demo;

public class Order {
    private Goods[] goods;
    private String num;

    public Order() {
    }

    public Order(Goods[] goods) {
        this.goods = goods;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public void thingshow(){
        for(int i =0;i<goods.length;i++){
                goods[i].show();
        }
    }

}
