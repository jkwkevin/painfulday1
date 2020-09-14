package com.jkw.javase.day1.day1;

public class TextMarry {
    public static void main(String[] args) {
        Person p1 = new Person("李逍遥",25,true,null);
        Person p2 = new Person("赵灵儿",23,false,null);
        p1.marry(p2);
    }
}
