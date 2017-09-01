package com.jll.day12;

import java.io.File;

public class ShowFile {
	public static void main(String[] args) {
		String srcPath = "d:/极域";
		System.out.println(show(srcPath));
		System.out.println(showAllFiles(srcPath));
	}
	public static int show(String scrPath) {
		File srcFile = new File(scrPath);
		if(!srcFile.exists()){
			System.out.println(scrPath+"文件不存在");
			return -1;
		}
		File[] files = srcFile.listFiles();
		if(files == null || files.length<1) {
			System.out.println("空文件夹");
			return 0;
		}
		for(File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		return files.length;
	}
	public static int showAllFiles(String srcPath) {
		File srcFile = new File(srcPath);
		if(!srcFile.exists()){
			System.out.println(srcPath+"文件不存在");
			return -1;
		}
		File[] files = srcFile.listFiles();
		System.out.println(srcFile.getAbsolutePath()+",下有"+files.length+"个文件");
		if(files == null || files.length<1) {
			System.out.println(srcFile.getAbsolutePath());
			return 0;
		}
		for(File file : files) {
			if(file.isDirectory()) {
				showAllFiles(file.getAbsolutePath());
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}
		return files.length;
	}
}
