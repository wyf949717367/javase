package com.baizhi;
import java.util.Locale;
import java.util.Scanner;
//subString()截取子字符串
// toLowerCase()和toUpperCase()字符进行大小写转换
//trim去掉开头和结尾的空白部分
public class StringTest8 {
    public static void main(String[] args) {
        String str="helloworld";
        //下标5开始往后(world)
        String s1 = str.substring(5);
        System.out.println(s1);
        //从下标0到5(hello)
        String s2 = str.substring(0, 5);
        System.out.println(s2);
        //获取用户输入的身份证号，根据身份证号输出用户的出生日期
        String str1="511502199504077936";
        String s3 = str1.substring(6, 14);
        System.out.println(s3);
        //将x1的字母全部转换为大写
        String x1="abcd";
        String s = x1.toUpperCase(Locale.ROOT);
        System.out.println(s);
        //将x2的字母全部转换为小写
        String x2="ABCD";
        String s4 = x2.toLowerCase(Locale.ROOT);
        System.out.println(s4);

        //去掉开头和结尾的空白部分
        String b="  abc  xyz  ";
        String s5 = b.trim();
        System.out.println(s5);
    }
}
