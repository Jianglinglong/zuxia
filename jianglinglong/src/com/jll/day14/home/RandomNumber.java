package com.jll.day14.home;

import java.util.Random;

public class RandomNumber {
	public static int randomInt() {
		return new Random().nextInt(10)+1;
	}
	public static void randomInts(int [] array) {
		if(array!=null && array.length>0) {
			for(int i = 0 ; i < array.length ; i ++ ) {
				array[i] = randomInt();
			}
		}
	}
}
