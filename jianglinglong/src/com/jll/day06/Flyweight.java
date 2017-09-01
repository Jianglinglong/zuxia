package com.jll.day06;

public class Flyweight {
	public static void main(String[] args) {
		Integer i = -128;
		Integer j = -128;
		int count=1;
	while(i<200) {
			System.out.print ((i == j) + " ");
			i++;
			j++;
			if(count++%10==0) {
				System.out.println();
			}
		}
	}
}
