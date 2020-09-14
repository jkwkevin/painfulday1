package com.jkw.javase.day1.day1;
//2.现有员工Employee类，有姓名，地址，基本工资属性，
//        董事类和经理类除以上属性，董事类有交通补助，经理类有所管部门，
//        三个类中都有显示其基本信息的方法show，但其实现方式不同，
//        请写出各类构造方法，及属性的get，set方法。
//        并要用到this和super关键字。

public class Employee {
    private String name;
    private String address;
    private int salary;
    public Employee(){

    }
    public void show(){
        System.out.println("姓名:" +this.name);
        System.out.println("地址:" +this.address);
        System.out.println("工资:" +this.salary);
    }

    public Employee(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
