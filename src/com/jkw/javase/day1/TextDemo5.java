package com.jkw.javase.day1;
//1、猜数字的游戏(GuessNumber)
//        游戏运行时产生一个1－100之间的随机整数，要求用户从控制台输入数字，
//        若输入的数字比产生的数字小，则输出：“太小了，再大一点！”；
//        若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
//        若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”，
//        若用户猜了7次还未猜对，则输出：“你太笨了，下次再来吧！”然后退出程序。
//        提示：
//        (1)、int num=(int)(Math.random()*100); //java.lang.Math;
//        (2)、Scanner in=new Scanner(System.in); // java.util.Scanner;
//        int n = in.nextInt();

import java.util.Scanner;

public class TextDemo5 {
    public static void main(String[] args) {
        double v = Math.random();
        int j = (int)(Math.random()*100+1);
        Scanner sc = new Scanner(System.in);

        for (int i=1;i<=7;i++){
            System.out.println("输入数字:");
            int num = sc.nextInt();
            if (num>j){
                System.out.println("太大了，再小一点！");
            }
            else if (num<j){
                System.out.println("太小了，再大一点！");
            }
            else{
                System.out.println("恭喜你猜对了！");
            }
        }
        System.out.println("你太笨了，下次再来吧！");


    }

}
