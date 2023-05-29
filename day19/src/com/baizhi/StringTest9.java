package com.baizhi;

public class StringTest9 {
    public static void main(String[] args) {
        int i=10;
        //调用print函数输出i的值
        //将i转为字符串类型int->String
        String s = String.valueOf(i);
        print(s);
        //利用了+拼接功能将i转化为String(方便)
        print(""+i);

        double x=4.6;
        //将x转为字符串类型double->String
        print(String.valueOf(x));

        Student stu = new Student("郭正翔",22);
        //将stu转为字符串类型Object类->String
        //ValueoOf(Object obj) 底层通过调用obj.toString()
         print(String.valueOf(stu));
    }
    //print方法
    public static void print(String str){
        System.out.println(str);
    }

}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

