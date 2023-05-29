package com.baizhi;
//字符串查找的功能
public class StringTest5 {
    public static void main(String[] args) {
        String s1="23afagac";
        //查找字符a第一次和最后一次出现的下标
        int a1=s1.indexOf('a');
        System.out.println("a字符第一次出现的下标为："+a1);
        int a2=s1.lastIndexOf('a');
        System.out.println("a字符最后一次出现的下标为："+a2);
        //指定开始查找的位置
        int a3=s1.indexOf('a',3);
        System.out.println("从第四个字符开始往后查找a字符第一次出现的位置："+a3);
        String str="xabccavababc";
        //查找字符串abc第一次出现的下标和最后一次出现的下标
        int x1=str.indexOf("abc");
        System.out.println("abc字符串第一次出现的下标为："+x1);
        int x2=str.lastIndexOf("abc");
        System.out.println("abc字符串最后一次出现的下标为："+x2);

    }
}
