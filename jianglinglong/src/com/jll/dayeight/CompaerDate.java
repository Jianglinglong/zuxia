package com.jll.dayeight;

import java.text.SimpleDateFormat;

public class CompaerDate {
	public static void compaerDate(String strDateFirst,String strDateSecond) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long fisrt = f.parse(strDateFirst).getTime();
			long secon = f.parse(strDateSecond).getTime();
			long count =Math.abs( fisrt - secon);
			count = count/(60*60*24*1000);
			System.out.println("两个日期相差"+count+"天。");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("日期格式不正确");
		}
	}
}
