package com.jll.day09;

import java.util.ArrayList;
import java.util.List;

public class Homework6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("刘德华");
		list.add("张学友");
		list.add("黎明");
		list.add("郭富城");
		list.add(list.indexOf("刘德华"), "成龙");
		list.set(list.indexOf("张学友"), "李小龙");
		list.remove("黎明");
		list.set(list.indexOf("郭富城"), "李连杰");
		Object[] objs = list.toArray();
		for(int i = objs.length;i>0;i--) {
			System.out.println(objs[i-1]);
		}
	}
}
