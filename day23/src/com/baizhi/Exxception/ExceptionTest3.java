package com.baizhi.Exxception;

import java.io.FileNotFoundException;

//积极处理异常  捕获异常 try Catch   产生多个异常
//执行catch中的代码处理异常，之后程序会继续向下执行
public class ExceptionTest3 {
    public static void main(String[] args) {
        System.out.println("main函数开始");
        m1();
        System.out.println("main函数结束");
    }

    public static void m1() {
        System.out.println("m1函数开始");
        m2(2);
        System.out.println("m1函数结束");
    }

    public static void m2(int n) {
        System.out.println("m2函数开始");
        //手动产生编译异常 必须处理
        try {
            if (n == 1) {
                throw new ClassNotFoundException("类找不到异常");
            }
        } catch (ClassNotFoundException e) {
            //打印异常信息
            e.printStackTrace();
        }
        try {
            if (n == 2) {
                throw new FileNotFoundException("文件找不到异常");
            }
        } catch (FileNotFoundException e1) {
            //打印异常信息
            e1.printStackTrace();
        }
        System.out.println("m2函数结束");
    }
}
