package com.jkw.javase.day1;

import java.util.Scanner;

/**1.输入学员的考试成绩，输出这学员考试成绩的级别。
 100      A级
 90~99    A级
 80~89    B级
 70~79    C级
 60~69    D级
 < 60     不合格*/
public class TextDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入考试成绩:");
        int score = sc.nextInt();
        int score1 = score/10;
        switch(score1){
            case 10:
                System.out.println("A级");
                    break;
            case 9:
                    System.out.println("A级");
                    break;
            case 8:
                    System.out.println("B级");
                    break;
            case 7:
                  System.out.println("C级");
                   break;
            case 6:
                    System.out.println("D级");
                    break;
            default:
                System.out.println("不合格");
                break;
        }
    }

}
