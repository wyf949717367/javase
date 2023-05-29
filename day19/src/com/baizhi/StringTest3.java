package com.baizhi;

public class StringTest3 {
    public static void main(String[] args) {
        //equals方法
        String s1="Hello";
        String s2=new String("Hello");
        System.out.println(s1==s2);//false
        //String重写了equals方法判断两个字符串的内容是否相等
        System.out.println(s1.equals(s2));//true
        //String重写了toString方法直接输出字符串的内容
        System.out.println(s1.toString());//Hello
    }
}
