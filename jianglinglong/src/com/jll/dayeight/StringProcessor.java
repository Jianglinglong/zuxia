package com.jll.dayeight;

public class StringProcessor {
	 public static String getSubString(String s, int beginNum, int endNum) throws Exception{
		 if(s==null|| s.length()==0) {
			Exception e = new Exception("字符串为空");
			throw e;
			}
		 if(beginNum<0 || beginNum>s.length()) {
			Exception e = new Exception("开始索引越界");
			throw e;
		 }
		 if(endNum<beginNum || endNum>s.length()) {
			Exception e = new Exception("结束索引越界");
			throw e;
		 }
		 return s.substring(beginNum, endNum);
	 }
	 public static String getSubString(String src, String splitStr ) throws Exception{
		 if(!src.contains(splitStr)) {
			 Exception e = new Exception("不包含子串");
			 throw e;
		 }
		 if(src.indexOf(splitStr)==src.lastIndexOf(splitStr)) {
			 Exception e = new Exception("子串只出现一次");
			 throw e;
		 }
		 return src.substring(src.indexOf(splitStr), src.lastIndexOf(splitStr));
	 }
	 public static String reverse(String s1) throws Exception{
		 StringBuffer s = new StringBuffer(s1);
		 return s.reverse().toString();
	 }
}
