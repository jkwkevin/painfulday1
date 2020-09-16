package com.jkw.javase.day3.List.Hashsetdemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<Person>();
        Person p1 = new Person("张三","男","001");
        Person p2 = new Person("李四","男","002");
        Person p3 = new Person("王五","女","003");
        Person p4 = new Person("张三","男","001");
        Person p5 = new Person("张三","男","007");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (Person person : set) {
            System.out.println(person);

        }
    }
}
