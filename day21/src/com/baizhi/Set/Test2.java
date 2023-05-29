package com.baizhi.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*4. (Set)编程：随机产生 10 个 0~50 之间的整数，存储在集合中，要求集合中的数据不能重复。
        知识补充： Random rd= new Random(); //Random 位于 java.util 包中
        int n = rd.nextInt(n); //0~n-1 之间的整数*/
public class Test2 {
    public static void main(String[] args) {
        HashSet<Integer> it = new HashSet<>();
        Random rd=new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; it.size()<10 ; i++) {
           int a= rd.nextInt(51);
               it.add(a);
        }
           System.out.println(it);
    }
}
