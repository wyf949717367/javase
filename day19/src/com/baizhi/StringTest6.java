package com.baizhi;
//replace替换功能 String不可变的，所以所有修改字符串内容的方法都是通过
//返回新的字符串来完成，不会对原字符造成影响
public class StringTest6 {
    public static void main(String[] args) {
        String str1="abcabc";
        //将str1中的a替换为x
        String s = str1.replace('a', 'x');
        System.out.println(s);
        //正则表达式的替换
        String str2="sc323ca4";
        //将数字替换为x
        String s1=str2.replaceAll("\\d","x");
        System.out.println(s1);
        //将str2中的a和c替换为z
        String s2=str2.replaceAll("[ac]","z");
        System.out.println(s2);
        //matches 判断当前字符串的格式和给定的正则表达式是否匹配
        String phoneNum="1320612067a";
        //判断phoneNum是否符合手机号的要求
        boolean b=phoneNum.matches("\\d{11}");
        System.out.println(b);
    }
}
