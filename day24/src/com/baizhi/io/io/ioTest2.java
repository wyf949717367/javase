package com.baizhi.io.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioTest2 {
    public static void main(String[] args) {
        //写出文件
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("day24\\file\\hello.txt");
            out.write("abc".getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (out != null) {//避免空指针异常
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    out = null;//流对象没有使用者则垃圾回收扫描到之后会回收该流对象
                }
            }
        }
    }
    }