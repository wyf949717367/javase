package com.baizhi.list;

import java.util.LinkedList;

public class LiistTest2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i <15 ; i++) {
            list.add(i);
        }
        System.out.println("集合元素为："+list);
        System.out.println("集合第三个元素为："+list.get(2));
        list.remove(10);
        list.remove(new Integer(14));
        System.out.println("删除后集合的元素为："+list);
        list.set(0,100);
        System.out.println("修改后集合的元素为"+list);
    }
}
