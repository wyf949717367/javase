package com.baizhi.inter1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InnerTest {
    public static void main(String[] args) {

        Outer outer=new Outer();
        Outer.Inner i=outer.new Inner();
 /*     简写
        Outer.Inner i=new Outer().new Inner();*/
        System.out.println(i.num);
        i.m();
    }
}
class Outer{
    int a=100;
    public void Outermethod(){
        System.out.println("外部类的成员方法");
    }
    class Inner{
        //成员属性
        public int num;
        //构造方法
        public Inner(){
            System.out.println("内部类的成员方法");
        }
        //成员方法
        public void m(){
            System.out.println("内部类的成员方法");
            //访问外部类的成员属性
            System.out.println(a);
            //调用外部类的成员方法
            Outermethod();
        }
    }
}