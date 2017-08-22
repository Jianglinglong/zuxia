package com.jll.dayfive;

public class Dog extends Animal {
	private String name;
	private String sex;
	@Override
	public void eat() {
		System.out.println(name+" is a " + this.type + ".Is eating!");
	}

	public Dog(String name, String sex) {
		this.name = name;
		this.sex = sex;
		this.type="狗";
	}

	public Dog() {
		super();
		this.type="狗";
	}
	@Override
	public void eat(Animal obj) {
		System.out.println(name+" is a " + this.type + ".Is eating "+obj.getName());
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
