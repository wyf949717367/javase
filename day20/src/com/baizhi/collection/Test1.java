package com.baizhi.collection;
/*(List)编程：创建一个工人类，属性：姓名、年龄、工资，要求如下：
        (1) 为 Worker 提供无、有参数的构造方法，属性私有，并提供公开的 get/set
        (2) 创建多个 Worker 类，存储在 List 集合中。
        (3) 打印输出所有的工人信息。
        (4) 计算所有工人的平均工资。
        (5) 打印输出姓名中包含 "胡" 的所有工人信息。
        (6) 打印输出所有姓 "胡" 的工人信息。
        (7) 键盘输入一个姓名，查找是否存在此员工，存在，则打印输出员工的信息，
        如果不存在，则输出"查无此人"
        (8) 输入一个工资，查询工资 大于 输入工资的员工信息。*/
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        Woker woker1 = new Woker("小胡", 18, 3000);
        Woker woker2 = new Woker("九四", 11, 4000);
        Woker woker3 = new Woker("胡及", 16, 6000);
        list.add(woker1);
        list.add(woker2);
        list.add(woker3);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        int sum=0;

        for (int i = 0; i <list.size(); i++) {
            Woker woker=(Woker)list.get(i);
            sum+=woker.getSalary();
        }
        System.out.println("平均工资为："+sum/list.size());

        for (Object i:
             list) {
            Woker woker=(Woker)i;
            if(woker.getName().contains("胡")){
                System.out.println("姓名中包含胡的所有工人信息："+woker);
            }
        }
        for (Object i:
             list) {
            Woker woker=(Woker)i;
//           if(woker.getName().charAt(0)=='胡'){}
            if(woker.getName().startsWith("胡")){
                System.out.println("胡字开"+woker);
            }
        }
      /*  (7) 键盘输入一个姓名，查找是否存在此员工，存在，则打印输出员工的信息，
        如果不存在，则输出"查无此人"*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个名字：");
        String s = sc.next();
        boolean b=false;//
        for (Object s1:
             list) {
            Woker woker=(Woker)s1;
            if(woker.getName().equals(s)){
                b=true;
                System.out.println(woker);
            }
        }
            if(!b){
                System.out.println("查无此人");
            }
        /*List list1 = new ArrayList();
        for (Object o:
             list) {
            Woker woker=(Woker)o;
            if(woker.getName().equals(s)){
                list1.add(woker);
                System.out.println(woker);
            }
        }
        if(list1.size()<=0){
            System.out.println("查无此人");
        }*/
//        (8) 输入一个工资，查询工资 大于 输入工资的员工信息。
        System.out.println("请输入工资：");
            double s1=sc.nextDouble();
        for (Object a:
             list) {
            Woker woker=(Woker)a;
            if(woker.getSalary()>s1){
                System.out.println(woker);
            }
        }

    }
}
class Woker{
    private String name;
    private int age;
    private double salary;
    public Woker(){}
    
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Woker(String name, int age, double salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Woker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woker woker = (Woker) o;
        return age == woker.age && Double.compare(woker.salary, salary) == 0 && Objects.equals(name, woker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
