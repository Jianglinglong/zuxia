package com.jll.five.test;

import com.jll.dayfive.Cat;
import com.jll.dayfive.Dog;

public class TestAnimal {
	public static void main(String[] args) {
		Cat cat = new Cat("小咪","女");
		Dog dog = new Dog("旺财","男");
		cat.setType("魚");
		cat.eat();
		dog.eat(cat);
		System.out.println("0.0".length());
	}
}
