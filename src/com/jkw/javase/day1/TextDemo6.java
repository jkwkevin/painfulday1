package com.jkw.javase.day1;
//2.在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
//        *
//        ***
//        *****
//        *******
//        *********
//        拓展：打印输出


import java.util.Scanner;

public class TextDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int k=0; k<n-i;k++){
                System.out.printf(" ");
            }
            for (int m=0;m<2*i-1;m++){
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
