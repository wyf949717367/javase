package com.baizhi.bz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IntegerTest {
    public static void main(String[] args) {
        //获取int类型最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //获取byte的最大值和最小值
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //创建Integer的对象
        Integer i1 = new Integer(8);
        //Integer类重写了toString方法
        System.out.println(i1);
        Integer i2 = new Integer("5");
        System.out.println(i2);

        byte b = i1.byteValue();
        System.out.println(b);
        //i2是Integer对象 转为int类型的值
        int i = i2.intValue();
        System.out.println(i);
        //i1转为String类型
        String s = i1.toString();
        System.out.println(s);

        //int转换为Integer类型
        //有参构造
        Integer i3 = new Integer(9);
        System.out.println(i3);
        //valueof
        Integer i4 = Integer.valueOf(12);
        System.out.println(i4);
        //String转换为int
        int num=Integer.parseInt("12");
        System.out.println(num);




    }
}

