package com.jll.daythree;

public class Lader {
	private double hight;
	private double widthUP;
	private double widthDown;
	
	public Lader() {
	}
	public Lader(double hight, double widthUP, double widthDown) {
		this.hight = hight;
		this.widthUP = widthUP;
		this.widthDown = widthDown;
	}
	public double getHight() {
		return hight;
	}
	public double getWidthUP() {
		return widthUP;
	}
	public double getWidthDown() {
		return widthDown;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public void setWidthUP(double widthUP) {
		this.widthUP = widthUP;
	}
	public void setWidthDown(double widthDown) {
		this.widthDown = widthDown;
	}
	
	public double areas() {
		return hight * (widthDown+widthUP)/2;
	}
	@Override
	public String toString() {
		return "这个梯形 [hight=" + hight + ", widthUP=" + widthUP + ", widthDown=" + widthDown + "]"
				+"面积为："+areas();
	}
	
}
