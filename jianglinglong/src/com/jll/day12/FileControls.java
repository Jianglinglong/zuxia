package com.jll.day12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileControls {
	public static void main(String[] args) {
		String fileName  = "E:/姜玲珑/YC97_ 姜玲珑_0815_Second.rar";
		String desPath = "E:/YC97_ 姜玲珑_0815_Second.rar";
		// System.out.println(copyFile(fileName, desPath)?"成功":"失败");
		System.out.println(moveFile(fileName, desPath) ? "成功" : "失败");
	}

	public static boolean copyFile(File srcFile, File destFile) {
		boolean flag = false;
		if (srcFile.exists()) {
			try {
				FileInputStream in = new FileInputStream(srcFile);
				DataInputStream srcIn = new DataInputStream(in);
				FileOutputStream out = new FileOutputStream(destFile);
				DataOutputStream desOut = new DataOutputStream(out);
				int length = 0;
				byte[] readBuffer = new byte[4096];
				while ((length = srcIn.read(readBuffer)) != -1) {
					desOut.write(readBuffer, 0, length);
				}
				desOut.flush();
				desOut.close();
				in.close();
				srcIn.close();
				flag = true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public static boolean copyFile(String srcPath, String desPath) {
		return copyFile(new File(srcPath), new File(desPath));
	}

	public static boolean moveFile(File srcFile, File destFile) {
		boolean flag = copyFile(srcFile, destFile);
		if (flag) {
			srcFile.delete();
		}
		return flag;
	}

	public static boolean moveFile(String srcPath, String desPath) {
		return moveFile(new File(srcPath), new File(desPath));
	}
}
