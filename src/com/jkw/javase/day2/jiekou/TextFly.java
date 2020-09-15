package com.jkw.javase.day2.jiekou;

public class TextFly {
    public  static void makefly(Plane plane,Birds birds){
        if(plane.isP()){
            plane.fly();
        }
        else{
            System.out.println("飞机不能起飞");
        }
        if(birds.isB()){
            birds.fly();
        }
        else{
            System.out.println("小鸟不能起飞");
        }
    }
    public static void main(String[] args) {
        Plane p1 = new Plane(true);
        Birds b1 = new Birds();
        makefly(p1,b1);

    }
}
