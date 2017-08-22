package com.jll.daythree;

public class Computer {
	static final String[] TYPES = new String[] {"台式电脑","笔记本电脑"};
	private boolean type;
	private String cputype;
	private double memery;
	private String cpationtype;
	private boolean isWell;
	
	public Computer(boolean type) {
		this.type = type;
	}
	public Computer(boolean type, boolean isWell) {
		this.type = type;
		this.isWell = isWell;
		cputype="i7";
		memery=8;
		cpationtype = "曲屏显示器";
	}
	public Computer(boolean type, String cputype, double memery, String cpationtype, boolean isWell) {
		this.type = type;
		this.cputype = cputype;
		this.memery = memery;
		this.cpationtype = cpationtype;
		this.isWell = isWell;
	}
	public Computer() {
		cputype="i7";
		memery=8;
		cpationtype = "曲屏显示器";
		type = true ;
		isWell = true;
	}
	public boolean getType() {
		return type;
	}
	public String getCputype() {
		return cputype;
	}
	public double getMemery() {
		return memery;
	}
	public String getCpationtype() {
		return cpationtype;
	}
	public boolean isWell() {
		return isWell;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public void setCputype(String cputype) {
		this.cputype = cputype;
	}
	public void setMemery(double memery) {
		this.memery = memery;
	}
	public void setCpationtype(String cpationtype) {
		this.cpationtype = cpationtype;
	}
	public void setWell(boolean isWell) {
		this.isWell = isWell;
	}
	
	public String toString() {
		String str="这是一台";
		if(isWell) {
			str+="好的";
		}else {
			str+="坏的";
		}
		if(type) {
			str += TYPES[0];
		}else {
			str +=TYPES[1];
		}
		str = str + "cpu:" + cputype + "内存:" + memery + "显示器:" + cpationtype;
		return str;
	}
	
}
