package com.baizhi.inter;

public class CESHI {
    public static void main(String[] args) {
        B b = new B();
        b.method();
        System.out.println("这是实现类中A的getNum方法"+b.getNum());
        b.setNum(5);
        b.method1();

    }
}
interface A{
    void method();
    int getNum();
    void setNum(int num);
}
interface C{
    void method1();
}
class B implements A,C{
    @Override
    public void method() {
        System.out.println("这是实现类中A的method方法");
    }

    @Override
    public int getNum() {
        return 8;
    }

    @Override
    public void setNum(int num) {
        System.out.println("这是实现类A中的setNum方法"+num);
    }

    @Override
    public void method1() {
        System.out.println("这是实现类中C的method1方法");
    }
}