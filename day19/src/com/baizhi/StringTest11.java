package com.baizhi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringTest11 {
    public static void main(String[] args) {
        Inter i=MyClass.method();
        i.show();
    }
    }
interface Inter{
    void show();
}
class MyClass{
    public static Inter method() {
        /*Inter i=new Inter(){
            @Override
            public void show() {
                System.out.println("sdsd");
            }
        };*/
        return ()->System.out.println("sdsdsd");

    }
    }

