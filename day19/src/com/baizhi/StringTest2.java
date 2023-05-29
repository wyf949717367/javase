package com.baizhi;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        //获取用户输入的文件名字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件名：");
        //通过字符串拿用户信息
        String s1=sc.next();
        //判断文件是否为java文件(.java结尾)
        //endsWith(String suffix)判断当前字符串是否以指定的后缀结尾
        if(s1.endsWith(".java")){
            System.out.println("这是一个java文件");

        }else{
            System.out.println("这不是一个java文件");
        }

        System.out.println("请输入一个身份证信息：");
        String sfz=sc.next();
        //判断身份证所在的省份
        //startsWith(String preffix)判断当前字符串是否以指定的前缀开头
        if(sfz.startsWith("11")){
            System.out.println("北京省");
        }
        if(sfz.startsWith("12")){
            System.out.println("天津省");
        }
    }
}
