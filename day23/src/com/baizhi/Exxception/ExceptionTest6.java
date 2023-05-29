package com.baizhi.Exxception;
//自定义异常
public class ExceptionTest6 {
    public static void main(String[] args) {
        try {
            play(20);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

public static void play(int age)throws AgeException{
    if(age<0){
        throw new AgeException("年龄值不能小于0岁");
    }
    System.out.println(age);
}
//自定义异常-- 反馈年龄不能小于0
//自定义编译时异常
public static class  AgeException extends Exception{
    //无参
    public AgeException(){}
    //有参
    public AgeException(String msg){
        super(msg);
    }
}
}