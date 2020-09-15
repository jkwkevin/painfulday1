package com.jkw.javase.day2.Demo;

public class Users {
    private String name;
    private String ordernum;

    public Users() {
    }

    public Users(String name, String ordernum) {
        this.name = name;
        this.ordernum = ordernum;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }
    public void downorder(Order o1){
        System.out.println("用户姓名:"+name);
        System.out.println("订单号:"+ordernum);
        System.out.println("-----------------------------------------------");
        System.out.println("订单信息为：");
        o1.thingshow();
    }
}
