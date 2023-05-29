package com.baizhi.inter1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal [] a=new Animal[]{
                new Dog(),
                new Cat(),
                new Bird(),
                new Cat(),
        };
        for (Animal a1:
             a) {
            //判断动物a1是否具有跑的功能 判断a1是否为Run接口的实验类的对象
            if(a1 instanceof Run){//狗和猫实现了Run接口
              Run r=(Run)a1;
              r.run();
            }
        }

    }
}
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}
interface Run{
    void run();
}
interface Fly{
    void fly();
}
class Dog extends Animal implements Run{

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    @Override
    public void sleep() {
        System.out.println("狗要睡觉");
    }

    @Override
    public void run() {
        System.out.println("狗会跑");
    }
}
class Cat extends Animal implements Run{
    @Override
    public void eat() {
        System.out.println("猫吃狗粮");
    }

    @Override
    public void sleep() {
        System.out.println("猫要睡觉");
    }

    @Override
    public void run() {
        System.out.println("猫会跑");
    }
}
class Bird extends Animal implements Fly{
    @Override
    public void eat() {
        System.out.println("鸟吃狗粮");
    }

    @Override
    public void sleep() {
        System.out.println("鸟要睡觉");
    }

    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }
}