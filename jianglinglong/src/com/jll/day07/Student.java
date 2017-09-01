package com.jll.day07;

public class Student {
	private String name;
	private int age;
	public Student() {
	}
	public Student(String name ,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean myequals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
