package com.baizhi.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("曹文盛", 19, '女');
        Student s2 = new Student("郭正翔", 20, '女');
        Student s3 = new Student("金湛清", 21, '女');
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (Student ss:
             list) {
            System.out.println(ss);
        }

        Iterator<Student> it1 = list.iterator();
        while (it1.hasNext()){
            Student ss = it1.next();
            System.out.println(ss);
        }

    }
}
class Student{
    private String name;
    private int age;
    private char sex;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}