package com.jll.dayfive.stirngpractice;

public class TestStrings {
	public static void main(String[] args) {
		String str1=" -123.2";
		String str2=new String(" -123.2");
		System.out.println("Using str1==str2:"+(str1==str2));
		System.out.println("Using str1.equals(str2):"+str1.equals(str2));
		
		str1 = "Welcome to China,we welcome you!";
		str2 = "欢迎来到中国中到来迎欢";
		System.out.println(str1.replace('e', '-')+"\n"+str1);
		for(int i =0 ; i < str2.length()/2 ; i ++) {
			System.out.print(str2.codePointBefore(i+1)+" ");
			System.out.println((str2.charAt(i)==str2.charAt(str2.length()-i-1))+" "+i);
		}
		StringBuffer s = new StringBuffer(str1);
		s.reverse();
		String ss = 'e'+"";
		char[] c = new char[] {'e'};
		String sss = new String (c, 0, c.length);
		System.out.println(ss);
		System.out.println(sss);
		System.out.println(s.indexOf("e"));
		System.out.println(str1.substring(str1.indexOf('e'), str1.lastIndexOf('e')));
		System.out.println(str1.substring(str1.indexOf('e'), s.length()-1- s.indexOf("e")));
	}
}
