package com.baizhi.inter;

public class TestClassE {
    public static void main(String[] args) {
       IC ic = new ClassE();
         ID id=(ID)ic;
         id.ma();
         id.mb();
         id.mc();
         id.md();
        System.out.println(ic instanceof IA);
        System.out.println(ic instanceof IB);
        System.out.println(ic instanceof IC);
        System.out.println(ic instanceof ID);
        System.out.println(ic instanceof ClassE);


    }
}
interface IA{
    void ma();
}
interface IB extends IA{
    void mb();
}
interface  IC{
    void mc();
}
interface ID extends IB,IC{
    void md();
}
//这是实现类
class ClassE implements ID{

    @Override
    public void ma() {
        System.out.println("这是实现类ClassE的ma方法");
    }

    @Override
    public void mb() {
        System.out.println("这是实现类ClassE的mb方法");
    }

    @Override
    public void mc() {
        System.out.println("这是实现类ClassE的mc方法");
    }

    @Override
    public void md() {
        System.out.println("这是实现类ClassE的md方法");
    }
}