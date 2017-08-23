package com.jll.dayeight;

public class Countstr {
	public static int count(String str , String findstr) {
		int index = str.lastIndexOf(findstr);
		int count=0;
		if(index!=-1) {
			String [] strs = str.split(findstr);
			count =strs.length;
			if(index!=(str.length()-findstr.length())) {
				count--;
			}
		}
		return count;
	}
}