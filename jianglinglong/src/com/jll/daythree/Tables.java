package com.jll.daythree;

public class Tables {
	public String name;
	public double weight;
	public double width;
	public double hight;
	public double length;
	public double areas;
	public Tables(String name, double weight, double length, double width, double hight) {
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.hight = hight;
		areas = areas();
	}
	public Tables() {
		name="";
		weight=0;
		width=0;
		hight=0;
		length=0;
	}
	
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public double getWidth() {
		return width;
	}
	public double getHight() {
		return hight;
	}
	public double getLength() {
		return length;
	}
	public double getAreas() {
		return areas;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setWidth(double width) {
		this.width = width;
		areas = areas();
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public void setLength(double length) {
		this.length = length;
		areas = areas();
	}
	public String toString() {
		return "Tables [name=" + name + ", weight=" + weight + ", length=" + length 
				+ ", width=" + width + ", hight="+ hight + ", areas=" + areas + "]";
	}
	private double areas() {
		return length*width;
	}
}
