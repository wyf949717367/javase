package com.baizhi.inter;

public class InterTest {
    public static void main(String[] args) {

        System.out.println(Inter.VALUE);
        //接口.静态方法名
        Inter.m1();
        Interimplements i1 = new Interimplements();
        //调用m方法 Alt+回车 是智能提示
        i1.m();

    }
}
