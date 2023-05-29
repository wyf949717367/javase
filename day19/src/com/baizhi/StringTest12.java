package com.baizhi;
//(String 类)编程：给定一个由数字组成的字符串，
//如:"1239586838923173478943890234092"；
// 统计出每个数字出现的次数。
public class StringTest12 {
    public static void main(String[] args) {
        int [] s=new int[10];
        String s1="1239586838923173478943890234092";

        for (int i = 0; i <s1.length(); i++) {
            int c = s1.charAt(i)-'0';
            s[c]++;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + "出现的次数为：" + s[i]);
        }
        /*char c='3';
        char b='0';
        int s=b;
        int a=c-'0';
        System.out.println(a);
        System.out.println(s);*/

        }

    }

