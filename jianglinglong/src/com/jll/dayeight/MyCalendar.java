package com.jll.dayeight;

import java.io.IOException;
import java.time.DayOfWeek;
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
		System.out.println();
		int day = cal.get(Calendar.DAY_OF_WEEK)-1;
		int days = cal.getActualMaximum(Calendar.DATE);
//		int tabs=Math.abs(index-day);
		print(index,day, days);
		System.out.println();
	}
	private void print(int index,int dayOfeweek,int days) {
		int flag = dayOfeweek-index;
		for(int j = 0 ; j <flag;j++) {
			System.out.print("\t");
		}
		for(int i = 0 ; i < days ; i ++) {
			if((flag+i)%7==0 && i!=0) {
				System.out.println();
			}
			System.out.print((i+1)+"\t");
		}
	}
}
