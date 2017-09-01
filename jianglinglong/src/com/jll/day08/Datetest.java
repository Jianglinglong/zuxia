package com.jll.day08;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datetest {
	public static void main(String[] args) {
		Date name = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
		System.out.println(f.format(name));
//		System.out.println(f.toLocalizedPattern());
//		try {
//			name =f.parse("1970-01-02");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Calendar cal = new GregorianCalendar() ;
//		TimeZone tz = cal.getTimeZone();
//		System.out.println(tz.getRawOffset());
		int hour = 60*60*1000;
		Date s = new Date(name.getTime()-cal.getTimeZone().getRawOffset());
		System.out.println(f.format(s));
		System.out.println(cal.getTimeZone().getRawOffset()/hour);
		System.out.println(cal.get(Calendar.ZONE_OFFSET)+cal.get(Calendar.DST_OFFSET)/60/1000);
		System.out.println(name);
	}
}
