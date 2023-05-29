package com.baizhi.io;
//关闭流
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioTest1 {
    public static void main(String[] args)  {
        //读取数据
        FileInputStream s1=null;
        try{
            s1 = new FileInputStream("day24\\file\\words.txt");
            int i ;
            while((i =s1.read())!=-1){
                System.out.println((char)i);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //关闭流
            if(s1!=null){//避免空指针异常
                try {
                    s1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    s1=null;//流对象没有使用者则垃圾回收扫描到之后会回收该流对象
                }
            }
        }
    }
}
