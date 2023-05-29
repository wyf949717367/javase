package com.baizhi.io.io.io;

import java.io.*;

//桥转换流  字节和字符之间  可以指定码表  解决中文乱码问题
//
public class ioTest10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader b1 = new InputStreamReader(new FileInputStream("d:\\data\\a.txt"),"GBK");
        BufferedReader b2 = new BufferedReader(b1);
        String s=null;
        while ((s= b2.readLine())!=null){
            System.out.println(s);
        }
            b2.close();
    }
    }

