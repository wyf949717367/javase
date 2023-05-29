package com.baizhi.io.io.io;

import java.io.*;

public class ioTest6 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字节输入流
        BufferedInputStream b1 = new BufferedInputStream(new FileInputStream("day24\\file\\b.txt"));
        //创建缓冲字节输出流
        BufferedOutputStream b2 = new BufferedOutputStream(new FileOutputStream("day24\\file\\c.txt"));
        //一边读取一边写出
        int i;
        while ((i=b1.read())!=-1){
            b2.write(i);
            b2.flush();
        }
        b1.close();
        b2.close();

    }
}
