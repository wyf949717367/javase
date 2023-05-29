package com.baizhi.inter;
//3. 编程：定义一个接口 MathTool，接口中有三个抽象方法如下：
//(1) “long fact(int m);”方法的功能为：求参数的阶乘
//(2) “long intPower(int m , int n)”方法的功能为：求 m 的 n 次方
//(3) “boolean findFactor(int m,int n)”方法的功能为：判断参数的和是否大于 100
//要求：定义类实现接口，编写应用程序，调用接口中的 3 个方法，并将调用方法的结果输出。
public class Test3 {
    public static void main(String[] args) {
        MathTool m = new MathToolImpl();
        System.out.println(m.fact(7));
        System.out.println(m.intPower(4, 7));
        System.out.println(m.findFactor(5, 8));
    }
}
interface MathTool{
    long fact(int m);
    long intPower(int m , int n);
    boolean findFactor(int m,int n);
}
class MathToolImpl implements MathTool{

    @Override
    public long fact(int m) {
        int sux=1;
        for (int i = 1; i <=m; i++) {
//            sux*=i;
//        }
        return sux;
    }

    @Override
    public long intPower(int m, int n) {
        int sx=1;
        for (int i = 1; i <=n; i++) {
              sx*=m;
        }
        return sx;
    }

    @Override
    public boolean findFactor(int m, int n) {
        return m+n>100;
    }
}