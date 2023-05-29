package com.baizhi.io.io.io;

import java.io.*;

//桥转换流  字节和字符之间  可以指定码表  解决中文乱码问题

public class ioTest11 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter f1 = new OutputStreamWriter(
                new FileOutputStream("d:\\data\\a.txt", true),
                "GBK");
        BufferedWriter f2 = new BufferedWriter(f1);
        f2.write("我爱你中国");
        f2.flush();
        f2.close();
    }
}
