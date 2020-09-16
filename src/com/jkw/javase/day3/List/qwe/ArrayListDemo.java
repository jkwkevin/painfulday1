package com.jkw.javase.day3.List.qwe;
/*
 * 1.List作业
模拟登陆，编写用户类，测试类。
  1>.给集合中存储5个用户对象。
  2>.从控制台输入用户名和密码，和集合中的对象信息进行比较，
  相同表示成功，不同表示失败。
  3>.有三次输入机会。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        User u1 = new User("张三",123);
        User u2 = new User("李四",1234);
        User u3 = new User("王二",12345);
        User u4 = new User("麻子",123456);
        User u5 = new User("路人甲",1234567);

        ArrayList<User> sites = new ArrayList<User>();
        sites.add(u1);
        sites.add(u2);
        sites.add(u3);
        sites.add(u4);
        sites.add(u5);

        Boolean flag=false;
        Scanner scanner = new Scanner(System.in);
        A:for(int k=0;k<3;k++){

           System.out.println("请输入用户名：");
           String s1 = scanner.next();
           System.out.println("请输入密码:");
           int s2 = scanner.nextInt();
           B:for (int i = 0; i <sites.size() ; i++) {
                System.out.println(sites.get(i));

           if((s1.equals(sites.get(i).getName())&&(s2 ==sites.get(i).getCode()))){
               System.out.println("成功登入");
               flag = true;
               break A;
           }
        }
    }
    if(!flag){
        System.out.println("失败");
    }
    }


}
