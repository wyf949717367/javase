package com.baizhi.Exxception;

import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest1 {
    private static NativeSandboxOutputStream out;

    public static void main(String[] args) throws Exception {
        //创建对象
        //追加写入 不是覆盖而是在末尾追加
        FileOutputStream f = new FileOutputStream("d:\\data\\words.txt",true);
        //1.写出数据
//        f.write(99);

        //2.写出字节数组
     /*   byte[] bs = new byte[]{'h', 'e', 'l', 'l', 'o'};
        f.write(bs);*/

        //3.
      /*  String s="helloworld";
        byte[]bytes=s.getBytes();
        f.write(bytes);*/

        //上面的简写
        f.write("abc".getBytes());


    }
}
