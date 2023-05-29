package com.baizhi.io.io.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ioTest5 {
    public static void main(String[] args) throws IOException {
        //字符输入输出的复制
        FileReader f1 = null;
        FileWriter f2 = null;
        try {
            f1 = new FileReader("day24\\file\\b.txt");
            f2= new FileWriter("day24\\file\\c.txt");
            int i;
            while ((i=f1.read())!=-1) {
                f2.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                f2.close();
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                f1=null;
                f2=null;
            }
        }


    }
}
