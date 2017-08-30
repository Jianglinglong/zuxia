package com.jll.day14.home;

public class Thread1 extends Thread {
	private int [] a;
	public Thread1(int[] a) {
		super();
		this.a = a;
	}

	synchronized public void sort(int[] array) {
		int count = 0;
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length; j++) {
					if (array[j] < array[i]) {
						int t = array[i];
						array[i] = array[j];
						array[j] = t;
					}
					count ++;
				}
			}
		}
		System.out.println("冒泡排序总共执行了"+count+"次");
	}

	public void run() {
		sort(a);
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
}
