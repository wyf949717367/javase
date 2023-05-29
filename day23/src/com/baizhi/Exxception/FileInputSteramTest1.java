package com.baizhi.Exxception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//每次一个字节数组的读取
public class FileInputSteramTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in= new FileInputStream("d:\\data\\words.txt");
     /*   //读取一个字节的数据
        int i=in.read();
        System.out.println((char)i);
        //读取文件中的所有字节数据
        int i;
        while ((i=in.read())!=-1){
            System.out.print((char)i);
        }*/
        //读取数据的容器 数组每次读取完不会清空 而是用新的数据进行覆盖
        byte[] bs = new byte[5];
        //i表示每次读取的字节的个数
        int i;
        while ((i=in.read(bs))!=-1){
            System.out.println(i);
            //将字节数组的内容转为字符在拼接成字符串
            //创建字符串对象时需要指定从下标0开始，取本次真正读取的字节的个数
            String s = new String(bs,0,i);
            System.out.println(s);
        }


    }
}
