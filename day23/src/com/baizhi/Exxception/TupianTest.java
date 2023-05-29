package com.baizhi.Exxception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TupianTest{
    //思路 输入流读取words.txt里的内容，将读取到的内容通过输出流写出到words1.txt
    //创建输入和输出流
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("d:\\data\\a.png");
        FileOutputStream f2=new FileOutputStream("d:\\data1\\b.png");
        int i;
        while ((i=f1.read())!=-1){
            f2.write(i);
        }

    }
}
