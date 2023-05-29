package com.baizhi.inter;

public class TestMain {
    public static void main(String[] args) {
        Animal [] as=new Animal[]{new Dog(),new Cat(),new Wolf()};
        int count=0;
        for (Animal a:
             as) {
            if(a instanceof Pet) {
                ((Pet) a).play();
                count++;
            }
                a.eat();
        }
        System.out.println(count);
    }
    }

abstract class Animal{

        public abstract void eat();

}

interface Pet{

        void play();

}

class Dog extends Animal implements Pet {

    public void eat() {

        System.out.println("Dog eat Bones");

    }

    public void play() {

        System.out.println("Play with Dog");

    }
}

class Cat extends Animal implements Pet {

    public void eat() {

        System.out.println("Cat eat fish");

    }

    public void play() {

        System.out.println("Play with Cat");

    }
}

class Wolf extends Animal {

            public void eat() {

                System.out.println("Wolf eat meat");
            }
}