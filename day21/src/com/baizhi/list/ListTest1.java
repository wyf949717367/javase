package com.baizhi.list;

import java.util.ArrayList;

public class ListTest1 {
    public static void main(String[] args) {
        //初始容量为10
        ArrayList arrayList= new ArrayList();
        //向集合中添加元素
        for (int i = 0; i <15 ; i++) {
            //集合超过10个会扩容
                arrayList.add(i);
        }
        System.out.println(arrayList);
        ArrayList list = new ArrayList(20);
        for (int i = 0; i <20 ; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
