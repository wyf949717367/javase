package com.baizhi.Map;

import java.util.*;

/*6. (Map)编程：定义一个银行用户 BankUser 类，用户信息为用户 id、用户名 userName、余额 balance;
   (1) 利用 HashMap 存储用户信息：id 作为键，用户作为值，创建多个用户对象进行存储
   (2) 遍历打印输出所有银行的用户名和对应的余额
   (3) 键盘输入一个用户名，检测是否存在此用户，存在-打印用户信息；不存在-打印查无此人
   (4) 打印输出余额大于 200000 的用户信息*/
public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer, BankUser> map = new HashMap<>();
        map.put(1,new BankUser("小明",2000));
        map.put(2,new BankUser("小白",3000));
        map.put(3,new BankUser("小话",400000));

        Set<Map.Entry<Integer, BankUser>> entries = map.entrySet();
        for (Map.Entry<Integer, BankUser> e:
             entries) {
            System.out.println("用户名："+e.getKey()+"="+"用户余额："+e.getValue());
        }
//  键盘输入一个用户名，检测是否存在此用户，存在-打印用户信息；不存在-打印查无此人
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个用户名");
        String s=sc.next();
        boolean b=false;
//     Set<Map.Entry<Integer, BankUser>> entries = map.entrySet();
        Set<Integer> set = map.keySet();
        for (Integer i :
             set) {
            BankUser bankUser = map.get(i);
            if(bankUser.getUserName().equals(s)){
                b=true;
                System.out.println(bankUser);
            }
        }
        if(!b){
            System.out.println("查无此人");
        }

//        (4) 打印输出余额大于 200000 的用户信息*/
//        Set<Map.Entry<Integer, BankUser>> entries = map.entrySet();
        Set<Integer> set1 = map.keySet();
        for (Integer o:
             set1) {
            BankUser bankUser = map.get(o);
            if(bankUser.getBalance()>=200000){
                System.out.println("余额大于200000的信息："+bankUser);
            }
        }


    }
    }

class BankUser {
    private String userName;
    private double balance;

    public BankUser() {
    }

    public BankUser(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankUser bankUser = (BankUser) o;
        return Double.compare(bankUser.balance, balance) == 0 && Objects.equals(userName, bankUser.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, balance);
    }
}
