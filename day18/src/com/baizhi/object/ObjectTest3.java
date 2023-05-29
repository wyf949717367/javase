package com.baizhi.object;

import java.util.Objects;

public class ObjectTest3 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        Student s=new Student("郭正翔",80,'女');
        //打印对象的属性值
        System.out.println(s);
        Student s1 = new Student("郭正翔",80,'女');
        //判断两个对象是否相等 因为重写了equals方法(判断当前对象和参数是否相等==)所以判断属性值打印true，
        // 没重写就判断地址值打印false
        System.out.println(s.equals(s1));//true
    }
}
class Student{
    private String name;
    private  int age;
    private  char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//重写toString方法打印输出属性值而不是地址值
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
//重写equals方法输出判断对象的属性值是否相等而不是判断地址值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}