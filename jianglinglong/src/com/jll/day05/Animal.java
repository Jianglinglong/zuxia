package com.jll.day05;

public abstract class Animal implements IAnimalFunction {
	protected String type="未知";
	protected double weight;
	protected double hight;
	protected int gae;
	public abstract String getName() ;
	public Animal() {
	}
	public String getType() {
		return type;
	}
	public double getWeight() {
		return weight;
	}
	public double getHight() {
		return hight;
	}
	public int getGae() {
		return gae;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public void setGae(int gae) {
		this.gae = gae;
	}
	public Animal(String type, int gae, double weight, double hight) {
		this.type = type;
		this.gae = gae;
		this.weight = weight;
		this.hight = hight;
	}
	
}
