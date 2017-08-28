package com.jll.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestNewsInfo {
	public static void main(String[] args) {
		ArrayList<NewsInfo> list = new ArrayList<NewsInfo>();
		if(readNews(list)) {
			showAllNews(list);
		}
		boolean loop = true;
		while (loop) {
			menu();
			int choice = getChoice();
			switch (choice) {
			case 1:
				showAllNews(list);
				break;
			case 2:
				addNews(list);
				break;
			case 3:
				while (!delNews(list)) {
					System.out.println("继续请输入(y/Y)");
					String input = getString();
					if (!(input.equals("y") || input.equals("Y"))) {
						break;
					}
				}
				break;
			case 4:
				saveNews(list);
				loop = false;
				break;
			default:
				break;
			}

		}
	}

	@SuppressWarnings("unchecked")
	public static boolean readNews(ArrayList<NewsInfo> list) {
		String str = System.getProperty("user.dir") + "newsList.dat";
		File srcFile = new File(str);
		if (srcFile.exists()) {
			try {
				FileInputStream in = new FileInputStream(srcFile);
				ObjectInputStream objIn = new ObjectInputStream(in);
				Object obj = objIn.readObject();
				if (obj instanceof ArrayList) {
					ArrayList<NewsInfo> temp = (ArrayList<NewsInfo>) obj;
					list.addAll(temp);
				}
				objIn.close();
				in.close();
				return true;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean saveNews(ArrayList<NewsInfo> list) {
		String str = System.getProperty("user.dir") + "newsList.dat";
		File srcFile = new File(str);
		FileOutputStream out;
		try {
			out = new FileOutputStream(srcFile);
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(list);
			objOut.flush();
			out.flush();
			objOut.close();
			out.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public static boolean delNews(ArrayList<NewsInfo> list) {
		System.out.println("请输入新闻编号:");
		int id = getChoice();
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof NewsInfo) {
				NewsInfo news = (NewsInfo) obj;
				if (news.getNewsId() == id) {
					list.remove(i);
					return true;
				}
			}
		}
		System.out.println("没有该新闻");
		return false;
	}

	public static void addNews(ArrayList<NewsInfo> list) {
		System.out.println("请输入新闻编号:");
		int id = getChoice();
		System.out.println("请输入新闻标题:");
		String title = getString();
		System.out.println("请输入新闻内容:");
		String conten = getString();
		list.add(new NewsInfo(id, title, conten));
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

	public static void showAllNews(ArrayList<NewsInfo> list) {
		if (list.size() == 0) {
			System.out.println("还没有发布消息");
			return;
		}
		System.out.println("编号\t\t\t标题\t\t\t\t\t内容");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).show();
		}
	}
}
