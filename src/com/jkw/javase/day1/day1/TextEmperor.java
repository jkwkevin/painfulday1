package com.jkw.javase.day1.day1;

public class TextEmperor {
    public static void main(String[] args) {
        Emperor e1 = new Emperor();
        e1.setName("Napoléon Bonaparte");
        e1.setTime("1804年－1815年");
        e1.setDescription("1800年6月，担任第一执政的拿破仑亲自领军，越过阿尔卑斯山，战胜意大利与热那亚方面的奥军，获得了著名的马伦哥战役大捷。");
        e1.setPolicy("拿破仑修改共和八年宪法为拿破仑宪法");
        System.out.println(e1.getName());
        System.out.println(e1.getTime());
        System.out.println(e1.getDescription());
        System.out.println(e1.getPolicy());
    }
}
