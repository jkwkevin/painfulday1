package com.jkw.javase.day1;





import java.util.Scanner;

/**
 * 1.需求：if示例,从键盘接收两个数字,再接收一个符号,然后进行运算
 * -------请输入第一个数字:8
 * -------请输入第二个数字:9
 * -------请输入运算符号:+
 * -------8+9=17
 */

public class TextDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int i = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int j = sc.nextInt();
        System.out.println("请输入运算符号:");
        String c1 = sc.next();
        System.out.println();

        if (c1=="+"){
            System.out.println(+(i+j));
        }
        else
            System.out.println("输入符号错误");

    }




}
