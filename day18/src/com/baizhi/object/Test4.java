package com.baizhi.object;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个邮箱地址");
        String email=sc.nextLine();
        if(email.indexOf("@")<1){
            System.out.println("缺少@或者没有用户名");
        }else{
            String name=email.substring(0,email.indexOf("@"));
            System.out.println("用户名："+name);
        }
        boolean a=email.contains("@");
        if(email.lastIndexOf("@")<email.lastIndexOf(".")){
            System.out.println("邮箱名合法");
        }else System.out.println("邮箱名无效");

    }
}
