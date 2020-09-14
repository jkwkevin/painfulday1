package com.jkw.javase.day1.day1;
/*
 * 1.该实例为定义一个成绩计算类。
类中包含的内容有：
  1、三个float类型的成员属性（Java成绩、C#成绩、数据库成绩）；
  2、对三个私有属性的公开的getter/setter方法；
  3、一个无参的构造方法和一个带参数的构造方法；
  4、计算三个科目的平均值的方法；
  5、计算三个科目的总成绩的方法；
  6、程序入口main方法。

在main中分别通过有参和无参的构造方法实例化成绩计算类的对象实体并传入成绩参数。
再通过对象调用计算平均值和总成绩的方法打印输出。
在计算平均值和总成绩的方法中，分别获取到属性的值进行计算。
 */

public class Score {
    private int javascore;
    private int cscore;
    private int databasescore;

    public Score(){

    }

    public Score(int javascore, int cscore, int databasescore) {
        this.javascore = javascore;
        this.cscore = cscore;
        this.databasescore = databasescore;
    }

    public int getJavascore() {
        return javascore;
    }

    public void setJavascore(int javascore) {
        this.javascore = javascore;
    }

    public int getCscore() {
        return cscore;
    }

    public void setCscore(int cscore) {
        this.cscore = cscore;
    }

    public int getDatabasescore() {
        return databasescore;
    }

    public void setDatabasescore(int databasescore) {
        this.databasescore = databasescore;
    }
    public float average(){
        float ave = (javascore + cscore + databasescore)/3;
        return ave;
    }
    public int sum(){
        int s = javascore + cscore + databasescore;
        return s;
    }
}
