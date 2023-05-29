package com.baizhi.Exxception;

import java.io.FileNotFoundException;
//消极处理异常（直接抛出多个异常类型）
public class ExceptionTest1 {
    public static void main(String[] args) throws ClassNotFoundException,FileNotFoundException {
        m1();
    }

    public static void m1() throws ClassNotFoundException, FileNotFoundException {
        m2(2);
    }

    public static void m2(int n) throws ClassNotFoundException, FileNotFoundException {
        if (n == 1) {
            //手动产生编译异常 必须处理
            throw new ClassNotFoundException("类找不到异常");
        }
        if (n == 2) {
            throw new FileNotFoundException("文件找不到异常");
        }


    }
}

