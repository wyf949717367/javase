package com.baizhi.Set;

import java.util.HashSet;
import java.util.Scanner;

/*(Set)编程：键盘输入一个字符串，利用集合去除其重复字符，打印输出最终不同的字符。*/
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=sc.next();
        HashSet<Character> s1 = new HashSet<>();
        char[] c1 = s.toCharArray();
        for (int i = 0; i <c1.length ; i++) {
               s1.add(c1[i]);
        }
        System.out.println(s1);
    }


    }

