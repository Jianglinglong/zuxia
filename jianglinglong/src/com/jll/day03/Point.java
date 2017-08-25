package com.jll.day03;

public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void show() {
		System.out.println("x坐标为："+x+"y坐标为："+y);
	}
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
