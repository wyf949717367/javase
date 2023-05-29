package com.baizhi.collection;
import java.util.List;
import java.util.ArrayList;

//List接口的方法
public class ListTest1 {
    public static void main(String[] args) {
        //创建List实现类的对象 多态
       List list = new ArrayList();
       //1.向List添加元素放在尾部
        list.add(5);
        list.add(10);
        list.add(34);
        System.out.println(list);
        //2.指定位置放入元素(下标,参数值)
        list.add(0,7);
        System.out.println(list);
        //3.查询下标处的元素值
        System.out.println(list.get(1));
        Object o = list.get(1);
        System.out.println(o);
        //4.查找参数元素的下标，如果集合中不存在该元素则返回-1，有则返回下标
        int i = list.indexOf(5);
        System.out.println(i);
        //5.根据下标删除元素
        Object o1 = list.remove(0);
        System.out.println(o1);
        System.out.println(list);
        //6.删除指定元素remove(Object obj)
        //不能直接放入数字，需要放入参数类型包装后对应的对象
        list.remove(new Integer(5));
        System.out.println(list);
        //7.修改下标处的元素的值为100
        list.set(1,100);
        System.out.println(list);
        //8.截取指定范围内的指定元素合成为集合返回
        list.add(23);
        System.out.println(list);
        //截取第二个到第三个元素(左闭右合)
        List list1 = list.subList(1, 3);
        System.out.println(list1);

    }
}
