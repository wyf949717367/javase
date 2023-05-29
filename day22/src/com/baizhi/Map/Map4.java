package com.baizhi.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* (Map)编程：已知某学校的教学课程内容安排如下：
         完成下列要求：
         (1) 使用 Map，以老师的名字作为键，教授的课程名作为值，表示上述课程安排
         (2) 增加了一位新老师 Allen 教 JDBC
         (3) Lucy 改为教 CoreJava
         (4) 遍历 Map，输出所有的老师及老师教授的课程
         (5) 利用 Map，输出所有教 JSP 的老师
         (6) 统计教授 CoreJava 和 JDBC 老师的人数*/
public class Map4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Orecle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        //新增老师
        map.put("Allen","JDBC");
        map.put("lucy","CoreJava");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> e:
             entries) {
            System.out.println("老师是"+e.getKey()+","+"课程是"+e.getValue());
        }
   /*     (5) 利用 Map，输出所有教 JSP 的老师
          (6) 统计教授 CoreJava 和 JDBC 老师的人数*/
        for (Map.Entry<String, String> e:
             entries) {
            if(e.getValue().equals("JSP")){
                System.out.println("教授JSP的老师是："+e.getKey());
            }
        }
        int count=0;
        for (Map.Entry<String, String> e:
             entries) {
            if(e.getValue().equals("CoreJava")||e.getValue().equals("JDBC")){
                count++;
            }
        }
        System.out.println("人数为："+count);
    }
}
