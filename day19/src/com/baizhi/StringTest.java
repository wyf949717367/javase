package com.baizhi;
//String 常用的构造方法
public class StringTest {
    public static void main(String[] args) {
        //byte[]数组转为字符串
        byte[] bs={65,66,67};
        String s=new String(bs);//根据码表 将整数值转为字符 在拼接成字符串
        System.out.println(s);
        //char[]转为String
        char[] cs={'a','b','v'};
        String s1=new String(cs);
        System.out.println(s1);

        char [] sc={'s','x','x'};
        String s2 = new String(sc);
        System.out.println(s2);
        byte [] vs={76,76,88};
        String s3 = new String(vs);
        System.out.println(s3);
    }
}
