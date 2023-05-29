package com.baizhi.io.io.io;

import java.io.*;
//缓冲字符流   第二种  PrintWriter
public class ioTest8 {
    public static void main(String[] args) throws IOException {
        BufferedReader b1 = new BufferedReader(new FileReader("day24\\file\\b.txt"));
        PrintWriter p2=new PrintWriter(new FileWriter("day24\\file\\f.txt"));
        /*//只读取一行数据
        String line = b1.readLine();*/
        //读取全部数据
        String line=null;
        while ((line= b1.readLine())!=null){
            //写出数据
            p2.println(line);
        }
            b1.close();
            p2.close();
    }
}
