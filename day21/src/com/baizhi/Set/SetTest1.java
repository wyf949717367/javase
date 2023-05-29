package com.baizhi.Set;
import java.util.Set;
import java.util.HashSet;
//Set方法的使用
//不允许重复元素 ,不是有序排列
public class SetTest1 {
    public static void main(String[] args) {
        //创建HashSet的对象  多态
        Set<String> set = new HashSet<>();
        set.add("小白");
        set.add("小黑");
        set.add("小红");
        System.out.println(set);
        System.out.println("集合的长度为："+set.size());
        set.remove("小黑");
        System.out.println("删除后剩余的元素为："+set);
        System.out.println(set.contains("小白"));


    }
}
