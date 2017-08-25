package com.jll.day05;

public class Cat extends Animal{
	private String name;
	private String sex;

	public Cat() {
		super();
		this.type="猫";
	}
	public Cat(String name, String sex) {
		this.name = name;
		this.sex = sex;
		this.type="猫";
	}
	public void eat() {
		System.out.println(name+" is a " + this.type + ".Is eating!");
	}
	public void eat(Animal obj) {
		System.out.println(name+" is a " + this.type + ".Is eating "+obj.getName());
	}
	public String getName() {
		return name;
	}
}
