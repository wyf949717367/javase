package com.baizhi;
//split--切割字符串
public class StringTest7 {
    public static void main(String[] args) {
        String str="hello.java";
        //获取文件名不包括后缀
        String[] s1 = str.split("\\.");
        System.out.println("文件名为："+s1[0]);
        String str1="abxsfxt";
        //根据x对str1进行切分
        String [] s2=str1.split("x");
        for (String x:
             s2) {
            System.out.println(x);
        }
    }
}
