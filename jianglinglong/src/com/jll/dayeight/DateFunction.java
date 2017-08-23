package com.jll.dayeight;

import java.text.SimpleDateFormat;
import com.jll.dayeight.ConvertException;
//import java.util.Date;
//import java.sql.Date;
public class DateFunction  {
	//取得当前日期
	public static java.util.Date getCurrentDate() {
		return new java.util.Date();
	}
	//返回当前年月日格式日期：yyyy-mm-dd
	public static String getCurrentShortDate () {
		return new SimpleDateFormat("yyyy-MM-dd").format(getCurrentDate());
	}
	//取得当前日期和时间 格式：yyyy-mm-dd hh:mm:ss
	public static String getCurrentDateTime() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(getCurrentDate());
	}
	//返回 “yyyy年xx月xx日”格式的日期
	public static String getCurrentChineseDate() {
		return new SimpleDateFormat("yyyy年MM月dd日").format(getCurrentDate());
	}
	 //将字符串日期转换为日期类型， 字符串格式为：yyyy-mm-dd, 如果转换失败，抛出转换异常
	public static java.util.Date convertToDate(String currentDate) throws Exception{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(currentDate);
		} catch (Exception e) {
			throw new Exception(currentDate + "格式不正确");
		}
	}
	//将日期时间：yyyy-mm-dd hh:mM:ss 转换为日期类型，如果转换失败抛出转换异常。
	public static java.util.Date convertToLongDate(String currentDate) throws ConvertException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return format.parse(currentDate);
		} catch (Exception e) {
			throw new ConvertException(currentDate + "格式不正确");
		}
	}
	//将日期类型转换为字符串类型，格式：yyyy-mm-dd
	public static String convertToDateString(java.sql.Date  date) {
		return new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(date.getTime()));
	}
	//将日期转换为字符串，格式为：yyyy-mm-dd hh:mm:ss
	 public static String convertToDateTimeString(java.sql.Date date){
			return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new java.util.Date(date.getTime()));
		}
}
