package com.jll.dayfour;
import com.jll.dayfour.Cat;
import com.jll.dayfour.Dog;
public class ExtendsTest {
	public static void main(String[] args) {
		Cat cat = new Cat("小花",false);
		System.out.println(cat);
		Animal dogs = new Animal("Dog");
		Dog dog = new Dog("旺財");
		dog.setSex(false);
		System.out.println(dog);
		cat.eat();
		cat.setHight(10);
		cat.setWeight(10);
		cat.eat(cat);
		cat.eat(dogs);
		cat.eat(dog);
		cat.setAge(10);
		cat.setSex(true);
		cat.setName("小咪");
		System.out.println(cat);
		System.out.println(cat.getName());
	}
}
