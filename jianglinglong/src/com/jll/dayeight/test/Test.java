package com.jll.dayeight.test;

import com.jll.dayeight.CompaerDate;
import com.jll.dayeight.DoubleColorBolls;
import com.jll.dayeight.MyCalendar;
import com.jll.dayeight.StringFunctuin;
import com.jll.dayeight.StringProcessor;

public class Test {
	public static void main(String[] args) throws Exception {
//		双色球
		DoubleColorBolls bolls = new DoubleColorBolls();
		bolls.getBolls();
		bolls.show();
		//大小写转换
		String str = "sdfadsf";
		str = toUper(str);
		System.out.println(str);
		str = toLower(str);
		System.out.println(str);
		//比较两个日期相差天数
		CompaerDate.compaerDate("1990-1-1","1990-12-31");
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
		//日历
		MyCalendar cal = new MyCalendar(1990,11);//默认时间为1970-01
		//设置以每周第几天为日历第一列.周日为0
		cal.set();
		cal.show(0);
		cal.show(1);
		cal.show(2);
		cal.show(3);
	}
	public static String toUper(String str) {
		return str.toUpperCase();
	}
	public static String toLower(String str) {
		return str.toLowerCase();
	}
}
