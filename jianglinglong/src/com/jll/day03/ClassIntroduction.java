package com.jll.day03;

public class ClassIntroduction {
	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();// StudentInfo("张三",20,"男",90);
		System.out.println(stu);
		stu.setStuAge(20);
		stu.setStunName("张三");
		stu.setStuScore(90);
		stu.setStuSex("男");
		System.out.println(stu);
		Lader lader = new Lader();
		System.out.println(lader);
		lader.setHight(5);
		lader.setWidthDown(10);
		lader.setWidthUP(5);
		System.out.println(lader.areas());
		System.out.println(lader);
		Point point = new Point();
		Point p = new Point(5, 5);
		System.out.println(p+"\n"+point);
		point.setX(1);
		point.setY(5);
		point.show();
		Calculator cal = new Calculator();
		cal.setFirstNum();
		cal.setSecondNum();
		cal.setOperator();
		System.out.println(cal.comput());
		System.out.println(cal);
		Computer computer = new Computer(false,false);
		System.out.println(computer);
		Computer computer1 = new Computer();
		System.out.println(computer1);
		Tables table = new Tables();
		System.out.println(table);
		table.setLength(10);
		table.setWidth(8);
		table.setName("饭桌");
		table.setWeight(80);
		table.setHight(70);
		System.out.println(table);
//		Animal dog = new Animal("dog");
//		Animal cat = new Animal("cat",10);
//		Animal fish = new Animal("fish",10,8.5,4,20);
//		dog.eat(cat);
//		dog.setAge(10);
//		dog.setHight(30);
//		dog.setSkincolor(5);
//		dog.setWeight(10);
//		Cat cat1 = new Cat();
//		cat1.setAge(3);
//		cat1.setHight(10);
//		cat1.setSkincolor(2);
//		cat1.setWeight(2);
//		System.out.println(cat1);
//		cat1.eat();
//		cat1.eat(dog);
//		cat1.eat(cat1);
	}

}
