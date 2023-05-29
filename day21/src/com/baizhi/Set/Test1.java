package com.baizhi.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*. (Set)编程：创建一个商品(Product)类,属性：商品名，商品单价，商品的数量，商品产地。
 (1) 创建多个商品对象，存储在 Set 集合中，集合中不能出现重复商品，商品名相同即为重复，在 Product
        类中添加必要的方法；
  (2) 显示所有的商品信息；
  (3) 打印输出商品价格 > 1000 的所有商品信息；
  (4) 打印售空的商品的信息；
  (5) 打印输出商品产地为"北京"的商品信息；
  (6) 输入一个商品名，查询出此类商品的信息，如果不存在，则打印商品"商场无此商品！！！"
  (7) 输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息。*/
public class Test1 {
    public static void main(String[] args) {
        HashSet<Product> set = new HashSet<>();
        set.add(new Product("洗发水",2000,7,"福建"));
        set.add(new Product("香肠",1000,3,"北京"));
        set.add(new Product("肥皂",2200,0,"广东"));
        System.out.println(set);
//        打印输出商品价格 > 1000 的所有商品信息；
        Iterator<Product> it = set.iterator();
        while (it.hasNext()){
            Product s1 = it.next();
            if(s1.salary>1000){
                System.out.println("大于1000的商品信息为："+s1);
            }
        }
       /* (4) 打印售空的商品的信息；
        (5) 打印输出商品产地为"北京"的商品信息；
        (6) 输入一个商品名，查询出此类商品的信息，如果不存在，则打印商品"商场无此商品！！！"
        (7) 输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息*/
        for (Product P:
             set) {
            if(P.num==0){
                System.out.println("售空的商品信息为："+P);
            }
        }


        Iterator<Product> it2 = set.iterator();
        while (it2.hasNext()){
            Product s2 = it2.next();
            if(s2.cd.equals("北京")){
                System.out.println("产地为北京的商品为："+s2);
            }
        }
//        (6) 输入一个商品名，查询出此类商品的信息，如果不存在，则打印商品"商场无此商品！！！"
//        (7) 输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息*/
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        System.out.println("请输入一个商品名：");
        String x=sc.next();
        boolean b=false;
        for (Product p:
             set) {
            if(p.name.equals(x.name)){
                b=true;
                System.out.println(p);
            }
        }
        if(!b){
            System.out.println("查无此商品");
        }
       /* HashSet<Product> set1 = new HashSet<>();
        for (Product o:
             set) {
            if(o.name.equals(x)){
                set1.add(o);
                System.out.println(o);
            }
        }
        if(set1.size()<=0){
            System.out.println("查无此商品");
        }*/
//        (7) 输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息*/
        System.out.println("请输入一个价格段：");
           double min=sc.nextDouble();
           double max=sc.nextDouble();
        for (Product P:set) {
            if(P.salary>=min&&P.salary<=max){
                System.out.println("这个区间的商品信息为："+P);
            }
        }

    }
}
class Product{
    String name;
    double salary;
    int num;
    String cd;

    public Product() {
    }

    public Product(String name, double salary, int num, String cd) {
        this.name = name;
        this.salary = salary;
        this.num = num;
        this.cd = cd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", num=" + num +
                ", cd='" + cd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.salary, salary) == 0 && num == product.num && Objects.equals(name, product.name) && Objects.equals(cd, product.cd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, num, cd);
    }
}