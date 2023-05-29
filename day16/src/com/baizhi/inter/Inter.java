package com.baizhi.inter;
//创建接口Inter
public interface Inter {
    //public static final 修饰
    int VALUE=10;//a是公开的静态常量；
    //接口中不允许定义构造方法和代码块
    //public Inter(){}
    //static{}
    //定义方法
    //接口中的方法均被public abstract修饰
    void m();
    //接口中的static方法（接口方法默认public修饰）
    //可以省略public
    static void m1(){
        System.out.println("这是接口中的静态方法");
    //default修饰
    //可以省略public
    /*default void m2(){
            System.out.println("这是接口中的默认方法");
        }*/
    }
}
