package com.baizhi.list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest3 {
    public static void main(String[] args) {
        //集合的遍历
        //fori遍历
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(10);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            }

        //foreach循环
        for(Object i:
                list) {
            System.out.println(i);
        }
        //迭代器循环
        //获取集合的迭代器对象
        //Iterator接口--对集合进行迭代遍历
        /*  boolean hasNext()--如果集合中有元素需要迭代遍历，则返回true
            Object next()--获取当前正在迭代遍历的元素对象
            remove()--删除当前正在迭代遍历的元素对象*/
//      如果涉及到遍历的同时删除元素 使用迭代器实现
        Iterator it = list.iterator();
        while (it.hasNext()){//如果集合中有元素需要迭代遍历，则返回true
            int o = (int)it.next();//获取当前正在迭代遍历的元素对象
            //判断是否为偶数
            if(o%2==0){
                //删除当前元素
                it.remove();
            }
        }
        System.out.print(list);



        /*list.remove(new Integer(3));
        System.out.println(list);
       */

    }
    }




