package com.baizhi.path;
//相对路径
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class path1 {
    public static void main(String[] args) throws IOException {
        //相对路径
        FileOutputStream out = new FileOutputStream("a.txt");
        out.write("abc".getBytes());
        //读取文件内容    FileInputStream      相对路径("day\\file\\words.txt")

    }

}
