package com.jkw.javase.day2.jiekou;

public class Birds implements CanFly{
    private boolean b;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public Birds() {
    }

    public Birds(boolean b) {
        this.b = b;
    }

    public void fly() {
        System.out.println("小鸟简单起飞！");
    }
}
