package com.jll.day14.home.homework1;

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
		System.out.println("结果是:");
		for(int i : array){
			System.out.print(i+",");
		}
		System.out.println();
	}

	public void run() {
		sort(a);
	}
}
