package com.jll.day14.home.homework2;

public class Test {
    public static void main(String[] args){
        Person zhansan = new Person("张三",20);
        Person lisi = new Person("李四",5);
        Saler sale = new Saler();
        sale.saleTickt(zhansan.getMoney());
        sale.saleTickt(lisi.getMoney());
    }
}
