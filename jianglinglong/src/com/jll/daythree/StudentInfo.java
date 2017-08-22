package com.jll.daythree;

public class StudentInfo {
	private String stunName;
	private int stuAge;
	private String stuSex;
	private double stuScore;
	
	public StudentInfo() {
	}
	public StudentInfo(String stunName, int stuAge, String stuSex) {
		this.stunName = stunName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
	}
	public StudentInfo(String stunName, int stuAge, String stuSex, double stuScore) {
		this.stunName = stunName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuScore = stuScore;
	}
	public String toString() {
		String str="";
		if(stunName=="" || stunName==null) {
			str = "学生未初始化";
		}else {
			str = stunName+ "的个人信息：\n[姓名\t年龄\t性别\t分数]";
			String space = "\n================";
			str = str+space + "\n["+stunName + "\t" +stuAge+ "\t" +stuSex+ "\t" + stuScore+"]"
					+space;
		}
		return str;
	}
	public void setStunName(String stunName) {
		this.stunName = stunName;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public void setStuScore(double stuScore) {
		this.stuScore = stuScore;
	}
	
	
}
