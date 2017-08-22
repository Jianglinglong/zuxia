package com.jll.dayfour;

public class Dog extends Animal {
	private String name;
	private String sex;
	
	public void guardingHome() {
		System.out.println(name+"is guarding your house!");
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Dog() {
		super("Dog");
	}
	
	public Dog(String name) {
		super("Dog");
		this.name = name;
	}
	public Dog(String name, boolean sex) {
		super("Dog");
		this.name = name;
		if(sex) {
			this.sex="雄性";
		}else {
			this.sex="雌性";
		}
	}
	
	public void setSex(boolean sex) {
		if(sex) {
			this.sex="雄性";
		}else {
			this.sex="雌性";
		}
	}
	
	public String toString() {
		String str =name +"是"+ super.getName()+",性别是"+sex + "，今年:"+this.getAge() + "岁,重量为:"
				+this.getWeight() + "kg,高度为:" + this.getHight() + "cm,是第"+
				this.getSkincolor() + "种颜色";
		return str;
	}
}
