package com.baizhi.io.io.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//读取d盘的txt打印到控制台

public class ioTest9 {
    public static void main(String[] args) throws IOException {
        BufferedReader b1 = new BufferedReader(new FileReader("d:\\data\\a.txt"));
        //读取数据
        String line=null;
        while ((line= b1.readLine())!=null){
            System.out.println(line);
        }
        b1.close();
    }
}
