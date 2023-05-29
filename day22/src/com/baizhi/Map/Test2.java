package com.baizhi.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1,new Student("小王",18,'女'));
        map.put(3,new Student("小白",11,'男'));
        map.put(2,new Student("小子",13,'女'));

        Set<Map.Entry<Integer, Student>> set = map.entrySet();
        //方法一.遍历map映射
       /* map.forEach((k,v)->{
            System.out.println(k+"="+v);
        });*/

        //方法二.遍历map映射
        for (Map.Entry<Integer,Student> es:
                set) {
            System.out.println(es.getKey()+"="+es.getValue());
        }
        //方法三.遍历map映射
        Set<Integer> set1 = map.keySet();
        for (Integer integer:
             set1) {
            //根据key获取value值储存到student里
            Student student = map.get(integer);
            System.out.println(integer+"="+student);
        }




        //输出性别为女的学生信息
        for (Map.Entry<Integer, Student> e1:
             set) {
            Student student = e1.getValue();
            if(student.getSex()=='女'){
                System.out.println(e1.getKey()+"="+student);
            }
        }



    }
    }

class Student{
    private  String name;
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