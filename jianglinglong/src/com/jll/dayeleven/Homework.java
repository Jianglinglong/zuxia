package com.jll.dayeleven;

import com.jll.dayeleven.MyException;

import java.util.Scanner;

public class Homework {
    public static void getAge() throws Exception{
        try {
            int age = new Scanner(System.in).nextInt();
        }catch (Exception e){
            throw new MyException("请输入数字");
        }
    }
    public static int main(String[] args) {
        try {
            Homework.getAge();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
