package com.jll.seven;
import java.util.Scanner;

import com.jll.seven.Student;
public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("小明", 10);
		Student stu2 = new Student("小明", 10);
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.myequals(stu2));
		emailTest();
	}
	public static void emailTest() {
		System.out.println("请输入要检查的邮箱：");
		String email = new Scanner(System.in).nextLine();
		String emailReg = "\\w+@(\\w+.)+\\w{2,3}";
		if( email.matches(emailReg)) {
			System.out.println(email + "的格式正确");
		}else {
			System.out.println(email + "的格式错误");
		}
	}
}
