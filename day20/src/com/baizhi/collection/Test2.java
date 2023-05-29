package com.baizhi.collection;

import java.util.ArrayList;
import java.util.List;

/*(1) 创建一个 List，在 List 中增加三个工人，基本信息如下 :
(2) 在 li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资 3300
        (3) 删除 wang5 的信息
        (4) 利用下标遍历，打印输出所有工人信息
        (5) 利用 forEach 遍历，打印输出所有年龄大于 20 的工人信息
        (6) 利用自遍历的方式，打印输出工人姓名长度大于 6 的信息。
        (7) 对 Worker 类添加 eqauls 方法*/
public class Test2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Woker woker1 = new Woker("zhang3", 18, 3000);
        Woker woker2 = new Woker("li4", 25, 3500);
        Woker woker3 = new Woker("wang5", 22, 3200);
        Woker woker4 = new Woker("zhao6", 24, 3300);
        list.add(woker1);
        list.add(woker2);
        list.add(woker3);
        list.add(1,woker4);
        list.remove(woker3);
        for (int i = 0; i <list.size() ; i++) {
        }
        System.out.println(list);
    }
}
class Worker{
    String name;
    int age;
    double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}