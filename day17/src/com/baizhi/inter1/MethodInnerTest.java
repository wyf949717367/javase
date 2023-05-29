package com.baizhi.inter1;

public class MethodInnerTest {
    public static void main(String[] args) {
        //创建A的对象
        A a=new A();
        a.method();
        //简写
        new A().method();

    }
}
class A{

    public void method(){
        //局部内部类（方法内部类）
        class Inner{
            int a=10;
            public Inner(){
                System.out.println("局部内部类的构造方法");
            }
            public void m1(){
                System.out.println("局部内部类的普通方法");
            }
        }
        //创建局部内部类的对象，范围从定义位置开始到方法结束
        Inner i=new Inner();
        System.out.println(i.a);
        i.m1();
    }
}