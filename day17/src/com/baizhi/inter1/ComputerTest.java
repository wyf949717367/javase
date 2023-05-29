package com.baizhi.inter1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.usb=new Mouse();
        c.on();

        //局部内部类（如果一个类只使用一次，则可以定义在方法中）
        class Lamp implements USB{

            @Override
            public void servise() {
                System.out.println("灯亮了");
            }
        }
        Lamp lamp=new Lamp();
        c.usb=lamp;
        c.on();

        //上面的简写 匿名内部类 定义在方法中
        //创建接口的实现类的对象，过程中没有给接口现实类起名，此时的接口实现类就是匿名内部类，只适合使用一次
        USB u =new USB(){
            @Override
            public void servise() {
                System.out.println("开始录音");
            }
        };
        c.usb=u;
        c.on();


    }
}
class Computer{
    USB usb;
    public void on(){
        System.out.println("电脑开机");
            if(usb!=null){
                usb.servise();
            }
    }
}
interface USB{
    void servise();
}
class Mouse implements USB{
    @Override
    public void servise() {
        System.out.println("控制光标");
    }
}
class keyboard implements USB{

    @Override
    public void servise() {
        System.out.println("打字输入");
    }
}
