package com.jll.daythree;
import java.util.Scanner;
public class Calculator {
	private double firstNum;
	private double secondNum;
	private char operator;
	public Calculator() {
	}
	private void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}
	private void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}
	public void setFirstNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		setFirstNum(sc.nextDouble());
	}
	public void setSecondNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第二个数:");
		setSecondNum(sc.nextDouble());
	}
	public void setOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入计算方式:");
		while(!setOperator(sc.nextLine().charAt(0))) {
		}
	}
 	private boolean setOperator(char operator) {
		if(operator=='+' || operator=='-' || operator=='*' || operator=='/') {
			this.operator = operator;
			return true;
		}else {
			System.out.println("请输入正确的运算符[ +，-，*，/ ]");
			return false;
		}
	}
	public double comput() {
		double sum=0;
		switch(operator) {
		case '-':
			sum= firstNum-secondNum;
			break;
		case '+':
			sum=firstNum+secondNum;
			break;
		case '*':
			sum= firstNum*secondNum;
			break;
		case '/':
			if(secondNum == 0) {
				System.out.println("被除数不能为零");
			}else {
				sum= firstNum/secondNum;
			}
			default:
				System.out.println("没有运算方式");
		}
		return sum;
	}
	public String toString() {
		return firstNum+""+operator+secondNum+"="+comput();
	}
}
