package com.jkw.javase.day1.day1;
/*
 * 2.封装一个皇帝类，里面有姓名，在位时间，政绩，描述4个属性，
 * 提供一个方法用来显示所有属性，私有化这些属性并提供对应的get以及set方法，
 * 并在测试类中测试。
 */

public class Emperor {
    private String name;
    private String time;
    private String policy;
    private String description;

    public Emperor(){

    }

    public Emperor(String name, String time, String policy, String description) {
        this.name = name;
        this.time = time;
        this.policy = policy;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
