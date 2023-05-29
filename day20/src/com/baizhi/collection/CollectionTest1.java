package com.baizhi.collection;
import java.util.Collection;
import java.util.ArrayList;
/*
Collection接口中包含的方法
1.add(Object obj)--向集合中添加元素
2.clean()--清空集合中的元素
3.contains(Object o)--判断是否包含指定元素
4.isEmpty()--判断集合是否为空元素
5.remove(Object o)--删除指定元素
6.size()--获取集合中元素的数量
 */

public class CollectionTest1 {
    public static void main(String[] args) {
        //创建集合的对象 多态
       Collection c1 = new ArrayList();
        System.out.println(c1);//空集合【】
        //1.添加元素-对象.方法
        c1.add("hello");
        c1.add("world");
        System.out.println(c1);
       /* c1.clear();//2.清空集合
        System.out.println(c1);*/
        //3.判断集合中是否包含参数元素
       if(c1.contains("hello")){
           System.out.println("集合中包含hello");
       }else{
           System.out.println("集合中不包含hello");
       }
       //4.判断集合是否为空
        if(c1.isEmpty()){
            System.out.println("集合为空");
        }else{
            System.out.println("集合不为空");
        }
        //5.删除指定元素
        c1.remove("hello");
        System.out.println(c1);
        //6.获取集合的元素数量
        Object obj=c1.size();
        System.out.println(obj);
        System.out.println(c1.size());




    }
}
