package com.jll.day14.home.homework2;

public class Person implements Runnable {
    private String name;
    private int money;
    private static Saler saler;
    
    public Person(){

    }
    public Person(String name,int money){
        this.setName(name);
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
    	while(true) {
    		saler.saleTickt(money);
    	}
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
