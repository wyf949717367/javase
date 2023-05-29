package com.baizhi.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("2000","小白");
        map.put("3000","小黑");
        map.put("5000","小绿");
        //如果要更换集合里的元素，直接修改key和value值
        map.put("3000","小红");
        map.put("5000","小黑");
        System.out.println(map);

      /*  map.clear();
        System.out.println(map);*/

        map.remove("3000");
        System.out.println(map);

       if (map.containsKey("5000")){
           System.out.println("yes");
       }else System.out.println("no");

        if(map.containsValue("小白")){
            System.out.println("yes");
        }else System.out.println("no");


        System.out.println(map.get("5000"));

        Collection<String> values = map.values();
        System.out.println(values);



        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        for (String S:
             keySet) {
            String s = map.get(S);
            System.out.println(S+"="+s);
        }



        }

    }



