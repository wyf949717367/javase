package com.baizhi.Exxception;
/*1. 编程：创建两个自定义异常类 MyException1 和 MyException2，要求如下：
  (1) MyException1 为已检查异常，MyException2 为运行时异常；
  (2) 这两个异常均具有两个构造函数：一个无参，另一个带字符串参数，参数表示产生异常的信息*/
public class Test1 {
    public static void main(String[] args) {
            try {
                num(7);
            }catch (MyException1 s1){
                s1.printStackTrace();
            }
            catch (MyException2 s2){
                s2.printStackTrace();
                throw new MyException2();
            }

    }

public static void num (int num) throws MyException1,MyException2{
        if(num<5){
            throw new  MyException1 ("数字不能小于5");
        }
            System.out.println(num);
       if(num>10){
        throw new  MyException2("数字不能大于10");
    }
             System.out.println(num);

    }



    //编译时异常
public static class  MyException1 extends Exception{
        public  MyException1(){}
        public  MyException1(String a){
            super(a);
        }
}
//运行时异常
public static class  MyException2 extends RuntimeException{
        public  MyException2(){}
        public  MyException2(String b){
            super(b);
        }
}



}
