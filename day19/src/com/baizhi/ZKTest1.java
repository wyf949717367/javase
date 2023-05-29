package com.baizhi;

public class  ZKTest1 {
    public static void main(String[] args) {
        Productor P = new Productor("平板电脑",12,4000.0);
        System.out.println(P);
        Productor p1 = new Productor("平板电脑",12,4000.0);
        System.out.println(P.equals(p1));
    }
}

class Productor{
    private String productorName;
    private Integer count;
    private Double price;
    public Productor(){}

    public Productor(String productorName, Integer count, Double price) {
        this.productorName = productorName;
        this.count = count;
        this.price = price;
    }

    public String getProductorName() {
        return productorName;
    }

    public void setProductorName(String productorName) {
        this.productorName = productorName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString (){
        return this.productorName+"-"+this.count+"-"+this.price;
    }
    public boolean equals(Object obj){
        return this.productorName.equals(((Productor)obj).productorName);
    }
}
