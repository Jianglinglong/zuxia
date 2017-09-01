package com.jll.day05.test;

import com.jll.day05.Cat;
import com.jll.day05.Dog;

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
