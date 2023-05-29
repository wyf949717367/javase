package com.baizhi.inter1;

public class TestLamp {

    public static void main(String[] args) {
        Lamp lamp=new Lamp();
           //局部内部类
            class B implements Light{
                @Override
                public void shine() {
                    System.out.println("shine in red");
                }
            }
            lamp.on(new B());
        //匿名内部类
            Light s=  new Light(){
                @Override
                public void shine() {
                    System.out.println("shine in yellow");
                }
            };
            lamp.on(s);
            //或者lamp.on(new Light()){
       /* @Override
        public void shine() {
            System.out.println("shine in yellow")*/
        // };


        //Lambda技术


    }
}
interface Light{

    void shine();
}
class Lamp{
    public void on(Light light){
        light.shine();
    }
}
