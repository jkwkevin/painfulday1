package com.jkw.javase.day1.day1;

public class TextScore {
    public static void main(String[] args) {
        Score s1 = new Score(90,98,70);
        System.out.println("第一名学生总成绩："+s1.sum());
        System.out.println("第一名学生总成绩平均数："+s1.average());
        Score s2 = new Score();
        s2.setJavascore(60);
        s2.setCscore(70);
        s2.setDatabasescore(80);
        System.out.println("第二名学生总成绩："+s2.sum());
        System.out.println("第二名学生总成绩平均数："+s2.average());


    }
}
