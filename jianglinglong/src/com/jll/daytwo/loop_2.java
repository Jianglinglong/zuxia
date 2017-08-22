package com.jll.daytwo;

//import java.io.IOException;
//import java.util.Arrays;
import java.util.Scanner;

public class loop_2 {

	/**
	 * @author jlg
	 */
	public static void main(String[] args) {
		int arr[] = new int [31];
		for(int i = 0 ; i < arr.length ; i ++){
			arr[i] = i;
		}
		Daytwo daytwo = new Daytwo();
		//斐波拉契数列第8位
		daytwo.feibo(8);
		//100至1000水仙花数
		daytwo.narcissisticNum(1000);
		//1至 1000 之间的素数
		daytwo.primeNum(1000);
		//求解10的因素之和
		daytwo.yinsu(10);
		//随机产生1-arr.length之间的不重复的数，并输出
		daytwo.random(arr);
		daytwo.output(arr);
		//判断字符串是否是回文数
		daytwo.huiwenNum();
		//输入10个数，进行排序并输出
		arr = new int [10];
		daytwo.input(arr);
		daytwo.sort(arr);
		daytwo.output(arr);
//		daytwo.huiwenNum();
	}
}
class Daytwo{
	public void huiwenNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字的字符串：");
		String str = sc.nextLine();
		if(str.length()<2){
			System.out.println(str + "不是回文数");
		}else{
			int index = str.length()/2;
			int count = 0;
			for(int i = 0 ; i < index ; i ++){
				if(str.charAt(i) !=str.charAt(str.length()-i-1)){
					System.out.println(str + "不是回文数");
					return;
				}
				count++;
			}
			System.out.println(str + "是回文数,循环：" + count);
		}
	}
	public void random(int arr[]){
		System.out.print("产生"+arr.length + "个随机不重复的数。");
		if(arr==null || arr.length==0){
			System.out.println("产生的随机数无法存贮！");
			return;
		}
		for(int i = 0 ; i < arr.length;i++){
			int temp = randomNum(arr.length);
			if(i == 0){
				arr[i]=temp;
			}
			if(!isExsit(arr,i,temp)){
				arr[i]=temp;
			}else{
				i--;
			}
		}
	}
	public void feibo(int index){
		int forword = 0;
		int nextword = 1;
		System.out.print("斐波拉契数列第"+index+"位是");
		if(index ==1 || index ==2){
			System.out.println(index-1);
			return;
		}
		index = index -2;
		for (int i = 0 ; i <index ; i++){
			int temp = forword + nextword;
			forword = nextword;
			nextword = temp;
		}
		System.out.println(nextword);
	}
	public void narcissisticNum(int index){
		if(index<500){
			System.out.println("水仙花数是从100开始的");
			return;
		}
		System.out.println("100至"+index+"水仙花数有：");
		int arr[] = new int [12];
		for(int  i = 100 ; i <= index ; i ++){
			int temp = i ;
			int sum=0;
			int count = 0;
			for(count = 0 ; temp>0 ; count ++){
				arr[count] = temp %10;
				temp /= 10;
			}
			for(int m = 0 ; m < count ;m ++ ){
				sum+= threeTimes(arr[m]);
			}
			if(sum == i){
				System.out.print(i + " ");
			}
		}
	}
	public void primeNum(int range){
		System.out.println("\n2至"+range+"的素数是：");
		int count = 0;
		for(int i =2 ; i < range+1 ; i++){
			boolean flag = true ;
			
			for(int j = 2 ; j < i/2+1 ; j++){
				if(0 == i%j){
					flag = false;
				}
			}
			if(flag){
				count++;
				System.out.print(i + " ");
				if(count%10 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("\n总共有"+count+"个。");
	}
	public void yinsu(int num){
		int sum = 1 + num;
		for(int i = 2 ; i < num ; i ++){
			if(num%i == 0){
				sum += i;
			}
		}
		System.out.println(num +"的因数之和是：" +sum);
	}
	public void sort(int [] arr){
		if(arr==null || arr.length==0){
			return;
		}
		System.out.println("开始排序");
		for(int i = 0 ; i < arr.length-1; i ++){
			for(int j =0 ; j <arr.length-1-i;j++){
				if(arr[j]<arr[j+1])
					swap(arr,j,j+1);
			}
		}
	}
	public void output(int[] arr){
		System.out.println("数组元素是：");
		if(arr==null || arr.length==0){
			return;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void input(int arr[]){
		if(arr==null || arr.length==0){
			return;
		}
		System.out.println("请输入10个整数：");
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i ++){
			arr[i]= sc.nextInt();
		}
	}
	private int threeTimes(int i){
		return i*i*i;
	}
	private void swap(int [] arr, int i , int j){
		if(i==j){
			return;
		}
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
	}
	private boolean isExsit(int arr[],int index, int obj){
		for(int i = 0 ; i < index ; i ++){
			if(obj == arr[i])
				return true;
		}
		return false;
	}
	private int randomNum(int num){
		return (int)(Math.random()*num +1);
	}
}