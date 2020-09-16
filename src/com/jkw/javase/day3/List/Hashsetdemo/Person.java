package com.jkw.javase.day3.List.Hashsetdemo;

import java.util.Objects;

public class Person {
    private String name;
    private String sex;
    private String num;

    public Person() {
    }

    public Person(String name, String sex, String num) {
        this.name = name;
        this.sex = sex;
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                sex.equals(person.sex) &&
                num.equals(person.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, num);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
