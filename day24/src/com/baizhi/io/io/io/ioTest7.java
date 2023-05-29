package com.baizhi.io.io.io;

import java.io.*;
import java.nio.Buffer;
//缓冲字符流     第一种  BufferedWriter
public class ioTest7 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输入流
        BufferedReader b1 = new BufferedReader(new FileReader("day24\\file\\b.txt"));
        //创建缓冲字符输出流
        BufferedWriter b2 = new BufferedWriter(new FileWriter("day24\\file\\e.txt"));
        //一边读取一边写出
        //读取一行数据
//        String line=b1.readLine();

        //读取全部数据
        String line = null;
        while ((line=b1.readLine())!=null){
            b2.write(line);
            //换行
            b2.newLine();
            b2.flush();
        }
            b1.close();
            b2.close();
    }
}
