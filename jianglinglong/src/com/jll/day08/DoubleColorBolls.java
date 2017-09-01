package com.jll.day08;

import java.util.Random;

public class DoubleColorBolls {
	private int [] redbolls;
	private Random rd;
	private int bluebolls;
	public DoubleColorBolls() {
		this.redbolls = new int [6];
		rd = new Random();
	}
	public void show() {
		if(redbolls[0]!=0) {
			System.out.print("红球:");
			for(int i:redbolls) {
				System.out.print(i+" ");
			}
			System.out.println("蓝球:"+bluebolls);
		}else {
			System.out.println("请初始化");
		}
	}
	public void getBolls() {
		redbolls[0]=rd.nextInt(33)+1;
		for(int i = 1 ; i < redbolls.length; i ++) {
			int num = rd.nextInt(33)+1;
			if(!isExist(redbolls, i, num)) {
				redbolls[i]=num;
			}else {
				i--;
			}
		}
		bluebolls=rd.nextInt(16)+1;
	}
	private boolean isExist(int[] bolls,int index,int num) {
		if(bolls.length<index){
			System.out.println(index+"is out of range");
			System.exit(0);
		}
		for(int i = 0 ; i < index ; i++) {
			if(bolls[i]==num) {
				return true;
			}
		}
		return false;
	}
}
