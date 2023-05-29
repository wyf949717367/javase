package com.baizhi.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(12,"xs");
        map.put(13,"ws");
        map.put(15,"zs");
        //遍历map
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry<Integer,String> E:
             set1) {
            System.out.println(E.getKey()+"="+E.getValue());

        }

    }
}
