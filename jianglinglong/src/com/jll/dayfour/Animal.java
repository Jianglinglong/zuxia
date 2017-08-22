package com.jll.dayfour;

public class Animal {
	private String name;
	private int age;
	private double hight;
	private double weight;
	private int skincolor;
	
	public Animal() {
		name = "undefined";
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal(String name, int age, double hight, double weight, int skincolor) {
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
		this.skincolor = skincolor;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHight() {
		return hight;
	}
	public double getWeight() {
		return weight;
	}
	public int getSkincolor() {
		return skincolor;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setSkincolor(int skincolor) {
		this.skincolor = skincolor;
	}
	
	public void eat(Animal obj) {
		String str = this.name + " is eating " + obj.name;
		System.out.println(str);
	}
	public String toString() {
		String str ="这种动物是" + this.name + "，平均寿命为:"+this.age + "岁,平均重量为:"
				+this.weight + "kg,平均高度为:" + this.hight + "cm,通常有"+this.skincolor + "种颜色";
		return str;
	}
}
