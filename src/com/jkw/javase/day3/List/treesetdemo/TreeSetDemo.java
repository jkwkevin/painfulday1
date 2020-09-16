package com.jkw.javase.day3.List.treesetdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {


        //方法二：让容器自身具备比较性
        TreeSet<People> set = new TreeSet<People>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if(o1.getName().equals(o2.getName())){
                    if(o1.getSex().equals(o2.getSex())){
                        return o1.getNum().compareTo(o2.getNum());
                    }
                    return o1.getSex().compareTo(o2.getSex());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        People p1 = new People("路人甲","男","001");
        People p2 = new People("路人乙","女","002");
        People p3 = new People("路人丁","男","003");
        People p4 = new People("路人甲","男","001");
        People p5 = new People("路人甲","男","007");

        //方法一 添加的元素具有比较性，元素必须实现comparable接口，重写compareTO（）
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (People people : set) {
            System.out.println(people);

        }
    }

}
