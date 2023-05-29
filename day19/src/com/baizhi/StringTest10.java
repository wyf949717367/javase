package com.baizhi;
//StringBuilder是可变的，拼接不会产生新的对象
public class StringTest10 {
    public static void main(String[] args) {
        //统计字符串拼接所需的时间
        long start = System.currentTimeMillis();
        String str="hello";
        for (int i = 0; i <=30000 ; i++) {
            str+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String类完成字符串拼接的时长："+(end-start)+"毫秒");

        //StringBuilder实现
        long start1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("hello");
        for (int i = 0; i <=30000 ; i++) {
            builder.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBulider类完成字符串拼接的时长："+(end1-start1)+"毫秒");
    }
}
