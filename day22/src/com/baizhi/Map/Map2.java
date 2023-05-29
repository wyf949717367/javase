package com.baizhi.Map;

import java.util.*;

/*从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界
        杯，则输出：没有举办世界杯。
        附录：截止 2009 年，历届世界杯冠军、世界杯冠军以及对应的夺冠年份*/
public class Map2 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        String s=sc.next();
        boolean b=false;
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> e:
             entries) {
            if(e.getKey().equals(s)){
                b=true;
                System.out.println("举办国家是："+e.getValue());
            }
        }
            if(!b){
                System.out.println("没有举办世界杯");
            }

    }
}
