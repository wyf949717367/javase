package com.baizhi.object;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();
        int a=0;
        int b=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(c<='z'&&c>='a'){
                b++;
            }else if(c>='A'&&c<='Z'){
                a++;
            }
        }
        System.out.println("字母的个数为："+(a+b));
   }
}
