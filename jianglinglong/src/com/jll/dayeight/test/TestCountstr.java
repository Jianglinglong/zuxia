package com.jll.dayeight.test;

import com.jll.dayeight.Countstr;

public class TestCountstr {
	public static void main(String[] args) {
		String str = " jav s java hello s str java jav ";
		String findstr = "jav";
		int num = Countstr.count(str, findstr);
		System.out.println(str+"中"+findstr+"出现"+ num+"次");
	}
}
