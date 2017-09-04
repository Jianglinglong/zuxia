//package com.jll.day14.home;
//
//public class Homework1 {
//	public static void main(String[] args) {
//		int[] a =new int [10];
//		RandomNumber.randomInts(a);
//		for(int i :a) {
//			System.out.print(i+",");
//		}
//		System.out.println();
//		Thread2 t2 = new Thread2(a);
//		Thread thread = new Thread(t2);
//		thread.start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		int sorted [] = t2.getA();
//		for(int i :sorted) {
//			System.out.println(i);
//		}
//	}
//}
