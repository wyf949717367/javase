package com.baizhi.inter1;

public class StaticInnerTest {
    public static void main(String[] args) {
        //创建静态内部类的对象
        StaticOuter.Inner i=new StaticOuter.Inner();
        //访问静态内部类中非静态的内容
        System.out.println(i.a);
        i.m2();
        //访问静态内部类中静态的内容
        System.out.println(StaticOuter.Inner.num);
        StaticOuter.Inner.m1();
    }
}
class StaticOuter{
    //外部类的静态属性
    static int b=1000;
    //外部类的静态方法
    public static void m3(){
        System.out.println("外部类的静态方法");
    }

    static class Inner{
        //静态内部类的成员属性
        int a=5;
        static int num=10;
        //静态内部类的构造方法
        public Inner(){
            System.out.println("静态内部类的构造方法");
        }
        //静态内部类的代码块
        static{
            System.out.println("静态内部类的代码块");
        }
        //静态内部类的静态方法
        public static void m1(){
            System.out.println("静态内部类的静态方法");
        }
        //静态内部类的普通方法
        public void m2(){
            System.out.println("静态内部类的普通方法");
            //访问外部类的静态属性
            System.out.println(b);
            //调用外部类的静态方法
            m3();
        }
    }
}