package com.jkw.javase.day3.List.Practice.P1;
/*
 * 1).HashSet存储对象。编写人类。
  实例化相同信息的人对象，存入到集合中,相同信息的对象不能重复存入。
 */

import java.util.Objects;

/*
 * 2).TreeSet中存储人对象，先按照人的姓名比较，当姓名相同时再按照年龄将对象降序存储。
 */
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
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
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
}
