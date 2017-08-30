package com.jll.day11;

import java.util.Scanner;

public class Homework {
	public static int getAge() throws Exception {
		int age = -1;
		try {
			 age = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			throw new MyException("请输入数字");
		}
		return age;
	}

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("请输入一个数字");
				Homework.getAge();
				System.out.println("谢谢配合");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
