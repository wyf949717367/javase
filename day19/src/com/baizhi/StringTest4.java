package com.baizhi;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        String s1="4S5D";
        System.out.println("验证码为："+s1);
        //获取用户输入的验证码信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String s2=sc.next();
        //不区分大小写判断字符串内容是否相等
        if(s2.equalsIgnoreCase(s1)){
            System.out.println("验证码校验成功");
        }else{
            System.out.println("验证码失败");
        }
    }
}
