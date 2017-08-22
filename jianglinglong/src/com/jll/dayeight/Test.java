package com.jll.dayeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.jll.dayeight.*;

public class Test {
	public static void main(String[] args) throws Exception {
		//双色球
		DoubleColorBolls bolls = new DoubleColorBolls();
		bolls.getBolls();
		bolls.show();
		//日历
		MyCalendar cal = new MyCalendar(1990,11);//默认时间为1970-01
		//设置以每周第几天为日历第一列.周日为0
		cal.show(0);
		cal.show(1);
		cal.show(2);
		cal.show(3);
		//大小写转换
		String str = "sdfadsf";
		str = toUper(str);
		System.out.println(str);
		str = toLower(str);
		System.out.println(str);
		//比较两个日期相差天数
		compaerDate("1990-1-1","1990-12-31");
		//测试StringFunctuin
		String s1 = "   think in java ! love java, ssd , sds   ";
		String s2 = "java";
		StringFunctuin sfun = new StringFunctuin();
		System.out.println(s1+"单词数为:"+sfun.getWordNumber(s1));
		System.out.println(s1+"中包含"+s2+":"+sfun.getStrsNumber(s1, s2)+"个");
		System.out.println(s1+"是否包含"+s2+":"+sfun.contain(s1, s2));
		//测试StringProcessor
		System.out.println(s1+"以"+s2+"第一次出现和最后一次出现之间的："+StringProcessor.getSubString(s1, s2));
		System.out.println(s1+"按索引截取"+0+","+s1.length()/2+":"+StringProcessor.getSubString(s1, 0, s1.length()/2));
		System.out.println(s1+"倒序为:"+StringProcessor.reverse(s1));
	}
	public static String toUper(String str) {
		return str.toUpperCase();
	}
	public static String toLower(String str) {
		return str.toLowerCase();
	}
	public static void compaerDate(String strDateFirst,String strDateSecond){
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long fisrt = f.parse(strDateFirst).getTime();
			long secon = f.parse(strDateSecond).getTime();
			long count =Math.abs( fisrt - secon);
			count = count/(60*60*24*1000);
			System.out.println("两个日期相差"+count+"天。");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("格式不正确.");
		}
		
	}
}
