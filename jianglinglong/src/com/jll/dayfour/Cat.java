package com.jll.dayfour;
import com.jll.dayfour.Animal;;
public class Cat extends Animal {
	private String sex;
	private String name;
	public Cat() {
		super.setName("Cat");
		name="小花";
		sex="未定义";
	}
	public Cat(String name) {
		super.setName("Cat");
		this.name = name;
		sex="未定义";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cat( String name,boolean sex) {
		super.setName("Cat");
		if(sex) {
			this.sex="雄性";
		}else {
			this.sex="雌性";
		}
		this.name = name;
	}
	public void eat() {
		System.out.println(name + "正在吃鱼");
	};
	public void eat(Animal obj) {
		System.out.println(name + " is eating "+ obj.getName());
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
	public String getSex() {
		return sex;
	}
	public String getName() {
		return name;
	}
	public void catchMouse() {
		System.out.println(name + "is catching mouse!");
	}
}
