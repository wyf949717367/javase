package com.baizhi.io.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//读取字符输入流
public class ioTest4 {
    public static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("day24\\file\\b.txt");

        //读取一个字符的数据
       /* int i=in.read();
        System.out.println((char)i);
         f1.close();
        */
        //读取所有字符
        int i;
        while ((i=f1.read())!=-1){
            System.out.print((char)i);
        }
        f1.close();
        }
    }

