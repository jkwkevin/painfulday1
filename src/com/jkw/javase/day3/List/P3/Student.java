package com.jkw.javase.day3.List.P3;
/*
 * 1).编写学生类，测试类中将多个学生存放在HashMap集合中，
key值用IntegerDemo类(int i)来存储，那么测试一下如果相同的IntegerDemo类来存储不相同的学生。
查看集合中的对象。验证HashMap 的不重复存储。
Map<IntegerDemo,Student>
 */
public class Student {
    private String name;
    private String sex;
    private String num;

    public Student() {
    }

    public Student(String name, String sex, String num) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
