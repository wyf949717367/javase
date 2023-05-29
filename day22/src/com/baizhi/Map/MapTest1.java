package com.baizhi.Map;

import com.sun.crypto.provider.HmacPKCS12PBESHA1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//map映射
public class MapTest1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //向集合添加元素
        map.put("13206120673","小红");
        map.put("13214995526","小白");
        map.put("12314245244","小紫");
        //添加元素key不能重复，value可以重复
        //1.如果新添加元素的k不存在，则直接添加，返回值为null
        //2.如果存在，则覆盖集合里有的元素的value，则返回被覆盖的原来的valye
        String s=map.put("13206120673","小黑");
        System.out.println("被覆盖掉的值为："+s);
        System.out.println(map);
        //添加null值没有意义
    /*    map.put(null,null);
        map.put("2200405050",null);*/
    /*    System.out.println(map);*/
      /*  2.map.clear();//清空集合*/
        //3.containsKye
       if( map.containsKey("13214995526")){
           System.out.println("存在");
       }else{
           System.out.println("不存在");
       }
       //4.containsValue
        if(map.containsValue("小笼包")){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
        //5.get(k,value)输入key获取对应的value值
        //13206120673手机号对应的姓名
        System.out.println(map.get("13206120673"));
        //6.remove()删除手机号为----的信息
        map.remove("13206120673");
        System.out.println(map);
        //7.size()集合的键值对的数量
        System.out.println(map.size());
        //8.Values()-返回值Collection<v>--获取map中所有key的Collection集合
        Collection<String> values = map.values();
        System.out.println(values);
        //9.KeySet()-返回值Set<k>--获取map中所有key的set集合
        Set<String> keySet = map.keySet();
        System.out.println(keySet);


        //1.遍历map映射
        Set<String> keySet1 = map.keySet();
   //        遍历set集合
        for (String s1:
             keySet1) {
            //根据key获取value值
            String value = map.get(s1);
            System.out.println(s1+"="+value);
        }

        //2.遍历循环
        Set<Map.Entry<String, String>> set = map.entrySet();
        //遍历set
        for (Map.Entry<String,String> e:
             set) {
                //获取key，value值(因为e里面有key和value对象，所以直接用哦e调用entry里的方法)
            System.out.println(e.getKey()+"="+e.getValue());

        }


    }
    }

