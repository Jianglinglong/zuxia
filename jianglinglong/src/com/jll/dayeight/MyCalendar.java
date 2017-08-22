package com.jll.dayeight;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	private int year;
	private int month;
	public MyCalendar() {
		year=1970;
		month=1;
	}
	public MyCalendar(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public void set() {
		System.out.print("请输入年份(1990)：");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.print("请输入月份(12):");
		month=sc.nextInt();
	}
	public void show() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		System.out.println("<<<<<<<<<万年历>>>>>>>>>");
		System.out.println("\t\t"+year+"年"+month+"月");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int days = cal.getActualMaximum(Calendar.DATE);
		for(int j = 0 ; j < day;j++) {
			System.out.print("\t");
		}
		for(int i = 0 ; i < days ; i ++) {
			if((day+i)%7==0) {
				System.out.println();
			}
			System.out.print((i+1)+"\t");
		}
		System.out.println();
	}
	public void show(int index) {
		index %=7; 
		String[] strs = {"日","一","二","三","四","五","六"};
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		System.out.println("<<<<<<<<<万年历>>>>>>>>>");
		System.out.println("\t\t"+year+"年"+month+"月");
		for(int i = index;i<strs.length;i++) {
			System.out.print(strs[i]+"\t");
		}
		for(int i = 0;i<index;i++) {
			System.out.print(strs[i]+"\t");
		}
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int days = cal.getActualMaximum(Calendar.DATE);
		int tabs=Math.abs(index-day);
			System.out.println();
			for(int j = 0 ; j < tabs;j++) {
				System.out.print("\t");
			}
		for(int i = 0 ; i < days ; i ++) {
			if((tabs+i)%7==0 && i!=0) {
				System.out.println();
			}
			System.out.print((i+1)+"\t");
		}
		System.out.println();
	}

}
