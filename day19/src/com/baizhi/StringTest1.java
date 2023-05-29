package com.baizhi;

public class StringTest1 {
    public static void main(String[] args) {
        String s = "abc";
        //获取第一个字符charAt(int index)--根据下标返回指定位置的字符
        char c = s.charAt(0);//数组第一个元素
        System.out.println(c);
        //length()长度方法获取字符串的长度
        System.out.println(s.length());//3
        //遍历得到所有字符
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        }
    }

