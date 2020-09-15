package com.jkw.javase.day2.jiekou;

public class Plane implements CanFly{
    private boolean p;

    public Plane() {
    }

    public Plane(boolean p) {
        this.p = p;
    }

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public void fly() {
        System.out.println("芜湖！起飞~");
    }
}
