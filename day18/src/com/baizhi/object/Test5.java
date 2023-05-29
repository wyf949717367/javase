package com.baizhi.object;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Random random=new Random();
        String s="ABCDEFGhijklmn1234567";
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i <4; i++) {
            s1.append(s.charAt(random.nextInt(s.length())));
        }
        System.out.println(s1);
    }
}
