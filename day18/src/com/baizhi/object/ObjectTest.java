package com.baizhi.object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ObjectTest {
    public static void main(String[] args) {
        //getClass()是返回当前对象的实际类型==返回引用中实际储存的对象的数据类型
        Object o=new Object();
        //调用getClass方法
        System.out.println(o.getClass().getName());
        //创建Animal对象
        Animal a=new Animal();
        System.out.println(a.getClass().getName());
        //多态创建dog对象
        Animal b=new Dog();
        System.out.println(b.getClass().getName());
        //getClass一般用在多态中进行判断两个引用的数据类型是否一致
        Animal a1=new Dog();
        Animal a2=new Dog();
        System.out.println(a1.getClass().getName()==a2.getClass().getName());
    }
}
class Animal{ }
class Dog extends Animal{}