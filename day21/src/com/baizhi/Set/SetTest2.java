package com.baizhi.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class SetTest2 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("曹文盛", 19, '女');
        Student s2 = new Student("郭正翔", 20, '女');
        Student s3 = new Student("金湛清", 21, '女');
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (Student student:
             set) {
            System.out.println(student);
        }
        Iterator<Student> i1 = set.iterator();
        while (i1.hasNext()){
            Student ss = i1.next();
            System.out.println(ss);
        }
        //set集合如何判断元素是否重复
      /*  1.调用hashcode()方法.---重写hashcode方法
        2.调用equals方法 ---重写equals方法   */
        Student s4 = new Student("曹文盛", 19, '女');
        set.add(s4);
        System.out.println(set);
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