package com.jkw.javase.day3.List.P3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * 1).编写学生类，测试类中将多个学生存放在HashMap集合中，
key值用IntegerDemo类(int i)来存储，那么测试一下如果相同的IntegerDemo类来存储不相同的学生。
查看集合中的对象。验证HashMap 的不重复存储。
Map<IntegerDemo,Student>
 */
public class IntegerDemo {
    private  String string;

    public IntegerDemo() {
    }

    public IntegerDemo(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "IntegerDemo{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerDemo that = (IntegerDemo) o;
        return string.equals(that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    public static void main(String[] args) {
        HashMap<IntegerDemo,Student> map = new HashMap<IntegerDemo,Student>();

        Student s1 = new Student("成斌","男","024");
        Student s2 = new Student("韩金龙","男","0124");
        Student s3 = new Student("刘谋","男","0123");
        Student s4 = new Student("阿里","女","011324");
        Student s5 = new Student("周淑怡","女","524");

        map.put(new IntegerDemo("abc"),s1);
        map.put(new IntegerDemo("abc"),s2);
        map.put(new IntegerDemo("bcc"),s3);
        map.put(new IntegerDemo("cec"),s4);
        map.put(new IntegerDemo("qie"),s5);

        Set<Map.Entry<IntegerDemo,Student>> entries = map.entrySet();
        for (Map.Entry<IntegerDemo, Student> entry : entries) {
            System.out.println("键："+entry.getKey()+",值："+entry.getValue());

        }

    }

}
