package com.jkw.javase.day3.List.P2;

public class PeopleInfo {
    private String name;
    private String sex;
    private String num;

    public PeopleInfo() {
    }

    public PeopleInfo(String name, String sex, String num) {
        this.name = name;
        this.sex = sex;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "PeopleInfo{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
