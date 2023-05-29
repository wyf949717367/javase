package com.baizhi.Exxception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//每次一个字节的读取
public class FileInputSteramTest {
    public static void main(String[] args) throws IOException {
        //读取问价内容
        //创建FileInputStream对象
        FileInputStream in= new FileInputStream("d:\\data\\words.txt");

        //调用对象的方法来读取数据
        //读取一个字节的数据
       /* int i=in.read();
        System.out.println((char)i);*/
        //读取文件中的所有字节数据
        int i;
        while ((i=in.read())!=-1){
            System.out.print((char)i);
        }
    }
}



