package com.jkw.javase.day3.List.P2;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 2).TreeSet中存储人对象，先按照人的姓名比较，当姓名相同时再按照年龄将对象降序存储。
 */
public class TreeSetInfo {
    public static void main(String[] args) {
        TreeSet<PeopleInfo> set = new TreeSet<PeopleInfo>(new Comparator<PeopleInfo>() {
            @Override
            public int compare(PeopleInfo o1, PeopleInfo o2) {
                if(o2.getName().equals(o1.getName())){
                    if(o2.getSex().equals(o1.getSex())){
                        return o2.getNum().compareTo(o1.getNum());
                    }
                    return o2.getSex().compareTo(o1.getSex());
                }
                return o2.getName().compareTo(o1.getName());

            }
        });

        PeopleInfo p1 = new PeopleInfo("旭旭宝宝","男","99999");
        PeopleInfo p2 = new PeopleInfo("PDD","男","002");
        PeopleInfo p3 = new PeopleInfo("旭旭宝宝","男","1111");
        PeopleInfo p4 = new PeopleInfo("旭旭宝宝","男","99999");
        PeopleInfo p5 = new PeopleInfo("周淑怡","女","20045");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (PeopleInfo peopleInfo : set) {
            System.out.println(peopleInfo);

        }
    }
}
