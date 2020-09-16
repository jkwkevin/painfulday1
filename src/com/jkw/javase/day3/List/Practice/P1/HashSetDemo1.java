package com.jkw.javase.day3.List.Practice.P1;

import java.util.HashSet;

public class HashSetDemo1 {
    /*
 * 1).HashSet存储对象。编写人类。
  实例化相同信息的人对象，存入到集合中,相同信息的对象不能重复存入。
 */

    /*
     * 2).TreeSet中存储人对象，先按照人的姓名比较，当姓名相同时再按照年龄将对象降序存储。
     */
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<Person>();
        Person p1 = new Person("甲","男","001");
        Person p2 = new Person("乙","男","002");
        Person p3 = new Person("甲","男","003");
        Person p4 = new Person("甲","男","001");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Person person : set) {
            System.out.println(person);
        }
    }
}
