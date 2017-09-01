package com.jll.day14.home.homework2;

public class Person implements Runnable {
    private String name;
    private int money;

    public Person(){

    }
    public Person(String name,int money){
        this.name = name;
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }

    @Override
    public void run() {

    }
}
