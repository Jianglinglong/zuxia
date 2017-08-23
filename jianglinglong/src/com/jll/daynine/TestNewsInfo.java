package com.jll.daynine;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNewsInfo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		boolean loop = true;
		while(loop) {
			menu();
			int choice = getChoice();
			switch(choice) {
			case 1:
				showAllNews(list);
				break;
			case 2:
				addNews(list);
				break;
			case 3:
				while(!delNews(list)) {
					System.out.println("是否继续(y/n)");
					if(getString().equals("n")) {
						break;
					}
				}
				break;
			case 4:
				loop=false;
				break;
			default:
				break;
			}
			
		}
	}
	public static boolean delNews(ArrayList list) {
		System.out.println("请输入新闻编号:");
		int id = getChoice();
		for(int i = 0 ; i < list.size() ; i ++) {
			Object obj = list.get(i);
			if(obj instanceof NewsInfo) {
				NewsInfo news = (NewsInfo) obj;
				if(news.getNewsId()==id) {
					list.remove(i);
					return true;
				}
			}
		}
		System.out.println("没有该新闻");
		return false;
	}
	public static void addNews(ArrayList list) {
		System.out.println("请输入新闻编号:");
		int id = getChoice();
		System.out.println("请输入新闻标题:");
		String title = getString();
		System.out.println("请输入新闻内容:");
		String conten = getString();
		list.add(new NewsInfo(id,title,conten));
	}
	public static int getChoice() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static String getString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static void menu() {
		System.out.println("1.查询新闻");
		System.out.println("2.添加新闻");
		System.out.println("3.删除新闻");
		System.out.println("4.退出");
		System.out.print("请选择功能:");
	}
	public static void showAllNews(ArrayList list) {
		if(list.size()==0) {
			System.out.println("还没有发布消息");
			return;
		}
		System.out.println("编号\t\t\t标题\t\t\t\t\t内容");
		for(int i = 0 ; i < list.size() ; i ++) {
			Object obj = list.get(i);
			if(obj instanceof NewsInfo) {
				NewsInfo news = (NewsInfo) obj;
				news.show();
			}
		}
	}
}
