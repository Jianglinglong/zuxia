package com.jll.dayeight.test;

import com.jll.dayeight.DateFunction;

public class TestDateFunction {
	public static void main(String[] args) {
		System.out.println(DateFunction.getCurrentDate());
		System.out.println(DateFunction.getCurrentChineseDate());
		System.out.println(DateFunction.getCurrentDateTime());
		System.out.println(DateFunction.getCurrentShortDate());
		System.out.println(DateFunction.convertToDateString( new java.sql.Date(DateFunction.getCurrentDate().getTime())));
		System.out.println(DateFunction.convertToDateTimeString(new java.sql.Date(DateFunction.getCurrentDate().getTime())));
		try {
			System.out.println(DateFunction.convertToDate("1990-12-01"));
			System.out.println(DateFunction.convertToLongDate("1990-12-1 8:10:05"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
