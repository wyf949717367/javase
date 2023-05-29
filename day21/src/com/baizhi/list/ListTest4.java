package com.baizhi.list;

import java.util.ArrayList;

public class ListTest4 {
    public static void main(String[] args) {
        //定义集合存储全班的年龄
        //泛型必须是引用数据类型
        //集合泛型在增强for循环里不用把Object强制转换为需要的数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);//18自动装箱成Integer对象
        list.add(15);
        list.add(16);
        for (int r:
             list) {
            System.out.println(r);
        }
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("曹文盛");
        list1.add("郭正翔");
        for (String s:
             list1) {
            System.out.println(s);
        }
    }
}
