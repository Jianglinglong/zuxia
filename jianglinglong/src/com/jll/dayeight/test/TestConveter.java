package com.jll.dayeight.test;

import com.jll.dayeight.ConvertException;
import com.jll.dayeight.Conveter;

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
