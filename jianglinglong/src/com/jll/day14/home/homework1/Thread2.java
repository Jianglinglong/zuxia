package com.jll.day14.home.homework1;

public class Thread2 implements Runnable {
	private int [] a;
	private static int count = 0;
	@Override
	public void run() {
		sort(a,0,a.length-1);
		System.out.println("快速排序总共用了:"+count+"次");
		System.out.println("结果是:");
		for(int i :a){
			System.out.print(i +",");
		}
		System.out.println();
	}
	public Thread2() {
		super();
	}
	public Thread2(int[] a) {
		super();
		this.a = a;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	synchronized public void sort(int [] a,int low,int hight) {
		if(a!=null && a.length>0) {
			if(hight<0 || low >=hight || hight <=low) {
				return;
			}
			int left = low;
			int right = hight;
			int key = a[left];
			while(left < right) {
				while(left < right && a[right] >= key) {
					right--;
					count++;
				}
				a[left] = a[right];
				while(left < right && a[left] <= key) {
					left++;
					count++;
				}
				a[right] = a[left];
			}
			a[left] = key;
			sort(a,low,left-1);
			sort(a,left+1,hight);
		}
	}
}
