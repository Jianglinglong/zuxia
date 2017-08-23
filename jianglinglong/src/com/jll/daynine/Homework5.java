package com.jll.daynine;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework5 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("刘德华");
		list.add("张学友");
		list.add("黎明");
		list.add("郭富城");
		System.out.println("========List=======");
		for(Object obj:list) {
			System.out.print(obj + " ");
		}
		System.out.println();
		Set set = new TreeSet();
		set.add("刘德华");
		set.add("张学友");
		set.add("黎明");
		set.add("郭富城");
		System.out.println("========Set=======");
		for(Object obj:set) {
			System.out.print(obj + " ");
		}
		
	}
}
