package com.baizhi.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*Map）在上一题目的基础上，增加如下功能：
        读入一支球队的名字，输出该球队夺冠的年份列表。
        例如：
        (1) 读入“巴西”，应当输出 1958、1962、1970、1994、2002
        (2) 读入“荷兰”，应当输出”没有获得过世界杯”。*/
public class Map3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("2006","意大利");
        map.put("2002","巴西");
        map.put("1998","法国");
        map.put("1994","巴西");
        map.put("1990","德国");
        map.put("1986","阿根廷");
        map.put("1982","意大利");
        map.put("1978","阿根廷");
        map.put("1974","德国");
        map.put("1970","巴西");
        map.put("1966","英格兰");
        map.put("1962","巴西");
        map.put("1958","巴西");
        map.put("1954","德国");
        map.put("1950","乌拉圭");
        map.put("1938","意大利");
        map.put("1934","意大利");
        map.put("1930","乌拉圭");
      /*  读入一支球队的名字，输出该球队夺冠的年份列表。
        例如：
        (1) 读入“巴西”，应当输出 1958、1962、1970、1994、2002
        (2) 读入“荷兰”，应当输出”没有获得过世界杯”.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个国家：");
        String s=sc.next();
        boolean b=false;
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> e:
                entries) {
            if(e.getValue().equals(s)){
                b=true;
                System.out.println(e.getKey());
            }
        }
        if(!b){
            System.out.println("没有获得过世界杯");
        }

    }
}


