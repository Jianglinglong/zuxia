package com.jll.day11;

public class Student {
	public static void main(String[] args) {
		int age=0;
		while(true) {
			System.out.print("请输入你的年龄:");
			try {
				age = getAge();
				break;
			} catch (AgeExcption e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		System.out.println("输入正常");
		System.out.println("您的年龄是"+age);
		System.out.println("程序正常结束");
		System.exit(0);
	}
	public static int getAge() throws AgeExcption {
		int age=0;
		try {
			 age= Homework.getAge();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(age >120 || age <18) {
			throw new AgeExcption("系统提示：年龄必须是18至120之间的正整数，请重新输入！");
		}
		return age;
	}
}
