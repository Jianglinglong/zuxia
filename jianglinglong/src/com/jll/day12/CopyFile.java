package com.jll.day12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		String fileName= "E:/姜玲珑/YC97_ 姜玲珑_0815_Second.rar";
		String desPath = "E:/YC97_ 姜玲珑_0814_First.rar";
		System.out.println(copyFile(fileName, desPath)?"成功":"失败");
	}
	public static boolean copyFile(String srcPath,String desPath) {
		boolean flag = false;
		File srcFile = new File(srcPath);
		File desFile = new File(desPath);
		try {
			FileInputStream in = new FileInputStream(srcFile);
			DataInputStream srcIn = new DataInputStream(in);
			FileOutputStream out = new FileOutputStream(desFile);
			DataOutputStream desOut = new DataOutputStream(out);
			int length = 0 ;
			byte[] readBuffer = new byte[4096]; 
			while((length = srcIn.read(readBuffer))!=-1) {
				desOut.write(readBuffer, 0, length);
			}
			desOut.flush();
			desOut.close();
			in.close();
			srcIn.close();
			flag = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
