package com.baizhi.io.io;

import java.io.FileWriter;
import java.io.IOException;
//写出字符输出流
public class ioTest3 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流的对象
        FileWriter f1 = new FileWriter("day24\\file\\b.txt");
        //写出字符中   字符流有缓冲区必须关闭流或者调用flush方法才会把数据写出到文件中
        f1.write('中');
        f1.write('国');
       /* //1.关闭流
        f1.close();*/
        //2.调用flush方法

        f1.write("我爱中国");


        f1.flush();



    }
}
