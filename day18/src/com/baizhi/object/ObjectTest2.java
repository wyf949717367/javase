package com.baizhi.object;

public class ObjectTest2 {
    public static void main(String[] args) {
        //toString()获取对象的字符串类型的值
        Object obj=new Object();
        //调用obj对象的toString（）
        String str=obj.toString();
        //以下代码效果相同
        System.out.println(str);//java.lang.Object@4554617c
        System.out.println(obj);//java.lang.Object@4554617c
        //当在输出语句中直接输出对象时，底层默认调用了对象toString方法，
        // 将toString方法返回的字符串结果进行输出打印



        //重写toString（）方法来实现输出对象的属性信息
        Teacher t=new Teacher("曹文盛",22,'女');
        System.out.println(t);//Teacher{name='曹文盛', age=22, sex=女}

    }
}
class Teacher{
    private String name;
    private int age;
    private char sex;

    public Teacher(){}
    public Teacher(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    //重写toString方法 输出对象的属性值
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}