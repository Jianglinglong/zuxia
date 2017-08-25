package com.jll.day08.test;

import com.jll.day08.ConvertException;
import com.jll.day08.Conveter;

public class TestConveter {
	public static void main(String[] args) {
		Conveter e = new Conveter();
		try {
			System.out.println(e.convertShort("111"));
			System.out.println(e.convertByte("111"));
			System.out.println(e.convertInt("111"));
			System.out.println(e.convertDouble("111"));
			System.out.println(e.convertFloat("asdf"));
		} catch (ConvertException e1) {
			e1.printStackTrace();
		}
	}
}
