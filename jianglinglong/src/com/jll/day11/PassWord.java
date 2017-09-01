package com.jll.day11;

import java.util.Scanner;

public class PassWord {
	public static void main(String[] args) {
		while(true) {
		try {
			System.out.println("请输入密码:");
			String passWord = new Scanner(System.in).nextLine().trim();
			System.out.println("检查密码中……");
			check(passWord);
			System.out.println("密码长度合格");
			break;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			}
		}
	}
	public static int check(String passWord) throws PassWordExcption {
		int length = passWord.length();
		if(length<6 || length>10) {
			throw new PassWordExcption("密码长度应在6-10位之间");
		}
		return length;
	}
}
