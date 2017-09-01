package com.jll.day14.home.homework1;

public class Homework1 {
	public static void main(String[] args) {
		int[] a =new int [10];
		RandomNumber.randomInts(a);
		for(int i :a) {
			System.out.print(i+",");
		}
		System.out.println();
		Thread2 t2 = new Thread2(a);
		Thread thread = new Thread(t2);
		thread.start();
		Thread1 th1 = new Thread1(a);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
