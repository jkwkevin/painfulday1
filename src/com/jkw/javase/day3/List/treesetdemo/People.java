package com.jkw.javase.day3.List.treesetdemo;

public class People /*implements Comparable<People>*/ {
    private String name;
    private String sex;
    private String num;

    public People() {
    }

    public People(String name, String sex, String num) {
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

//    @Override
//    public int compareTo(People o) {
//        if(this.name.equals(o.name)){
//            if (this.sex.equals(o.sex)){
//                return this.num.compareTo(o.num);
//            }
//            return this.sex.compareTo(o.sex);
//        }
//        return this.name.compareTo(o.name);
//    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
