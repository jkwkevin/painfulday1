package com.jkw.javase.day1;

import java.util.Scanner;

/**
 * 3.需求：应征入伍： 条件：男，身高170厘米以上，20--26周岁
 * 女，身高162厘米以上，20---22周岁之间
 * 从键盘输入性别，年龄以及身高，判断是否可以应征入伍！
 */

public class TextDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别:");
        String c1 = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入身高:");
        double height = sc.nextDouble();
        if ((c1.equals("男")) && (height>=170)&&((age>=20)&&(age<=26))) {
            System.out.println("可以入伍");
        }
        else if ((c1.equals("女")) && (height>=162)&&((age>=20)&&(age<=22))){
            System.out.println("可以入伍");

        }
        else{
            System.out.println("不符合条件");
        }
    }
}
