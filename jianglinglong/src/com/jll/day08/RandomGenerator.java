package com.jll.day08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomGenerator {
	/**
	 * @param bitnum 指定随机数的位数。
	 * @return 如bitnum=4, 生成4位的随机数。
	 */
	public int generateRandom(int bitnum) {
		StringBuffer strBuffer = new StringBuffer();
		Random rd = new Random();
		for( int i = 0 ; i < bitnum ; i ++) {
			if(i!=0) {
				strBuffer.append(rd.nextInt(10));
			}else {
				strBuffer.append(rd.nextInt(9)+1);
			}
		}
		return Integer.valueOf(strBuffer.toString());
	}
	
	/**
	 * @param len 长度为len的随机数字
	 * @return 格式为yyyyMMddhhmmss+len长度随机数字的随机数。
	 */
	public String dateRandom(int len) {
		return new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+generateRandom(len);
	}
}
