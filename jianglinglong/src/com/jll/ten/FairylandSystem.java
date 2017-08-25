package com.jll.ten;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FairylandSystem {
	private static  Map mp = new HashMap(10);
	public static void main(String[] args) {
		FairylandSystem system = new FairylandSystem();
		int choice = 0;
		boolean flag = true;
		while(flag) {
			system.menu();
			choice = getInt();
			switch (choice) {
			case 1:
				system.addImmortal(system.newImmortal());
				system.showAll();
				break;
			case 2:
				System.out.print("请输入你要删除的天兵的名字");
				if(system.remove(getString())) {
					System.out.println("成功删除");
				}
				system.showAll();
				break;
			case 3:
				System.out.println("请输入你要修改的天兵的名字");
				String oldname = getString();
				if(system.isExist(oldname)!=-1) {
					system.remove(oldname);
					system.addImmortal(system.newImmortal());
				}else {
					System.out.println("要修改的天兵不存在,是否添加(y/n)");
					String yn = getString();
					if(yn.equalsIgnoreCase("y")) {
						system.addImmortal(system.newImmortal());
					}
				}
				system.showAll();
				break;
			case 4:
				System.out.println("请输入你要查询的天兵的名字");
				system.show(getString());
				break;
			case 5:
				flag=false;
				break;
			default:
				System.out.println("请选择功能：");
//				system.menu();
				break;
			}
		}
	}
	public Immortal newImmortal() {
		System.out.println("请输入天兵的信息");
		System.out.print("姓名:");
		String name = getString();
		System.out.print("技能:");
		String skil = getString();
		System.out.print("编号:");
		int num = getInt();
		return new Immortal(name, skil,num);
	}
	public void menu() {
		System.out.println("**********仙界统治**********");
		System.out.println("1、添加");
		System.out.println("2、删除");
		System.out.println("3、修改");
		System.out.println("4、查询");
		System.out.println("5、退出");
		System.out.print("请选择(1,2,3,4,5):");
	}
	public int isExist(String name) {
		Set set = mp.keySet();
		for(Object index:set) {
			if(((Immortal) mp.get(index)).getImName().equals(name))
				return (int) index;
		}
		return -1;
	}
	public void addImmortal(Immortal im) {
		mp.put(im.getImNum(), im);
	}
	public boolean remove(String name) {
		boolean flag = false;
		int key = isExist(name);
		if(key!=-1) {
			mp.remove(key);
			flag=true;
		}
		return flag;
	}
	public boolean remove(Immortal im) {
		return remove(im.getImName());
	}
	public void show(String imName) {
		int key = isExist(imName);
		if(key!=-1) {
			System.out.println(mp.get(key));
		}else {
			System.out.println(imName+ "不存在");
		}
	}
	public void showAll() {
		Set set = mp.keySet();
		for(Object obj:set) {
			System.out.println(mp.get(obj)+" ");
		}
	}
	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}
	public static String getString() {
		return new Scanner(System.in).nextLine();
	}
}
