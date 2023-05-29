package com.baizhi.Exxception;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n;
        n=sc.nextInt();

        try {
            m(n);
        }catch (MyException1 ex1){
            ex1.printStackTrace();
        }catch (MyException2 ex2){
            System.out.println(ex2.getMessage());
            throw new MyException2();
        }
    }

    public static void m (int n) throws MyException1 {
        if(n==1){
            throw new MyException1("n==1");
        }else {
            throw new MyException2("n==2");

        }

    }

    //编译时异常
    public static class  MyException1 extends Exception{
        public  MyException1(){}
        public  MyException1(String a){
            super(a);
        }
    }
    //运行时异常
    public static class  MyException2 extends RuntimeException{
        public  MyException2(){}
        public  MyException2(String b){
            super(b);
        }
    }



}
