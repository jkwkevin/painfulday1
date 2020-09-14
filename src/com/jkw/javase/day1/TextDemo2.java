package com.jkw.javase.day1;

import java.util.Scanner;

/**
 * 2.需求：飞机票在淡季是有优惠政策的,而放假期间是没有优惠的，
 * 假设在元旦三天（1.01---1.03），
 * 五一三天（5.01---5.03），
 * 十一七天（10.01---10.07）无任何优惠，
 * 除了以上13天，都打8折， 请输入您哪天订票，以及票价（自己设定一个吧），
 * 输出应付多少钱？
 */
public class TextDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订票的时间:");
        double md = sc.nextDouble();
        double price = 500;
        if((md!=1.01)&& (md!=1.02)&& (md!=1.03)&&(md!=5.01)&&(md!=5.02)&&(md!=5.03)&&(md!=10.01)&&(md!=10.02) &&(md!=10.03)&& (md!=10.04) &&(md!=10.05) &&(md!=10.06) &&(md!=10.07))
        {
            price = price*0.8;
        }
        System.out.println("应付的钱为:"+price);
    }

}
