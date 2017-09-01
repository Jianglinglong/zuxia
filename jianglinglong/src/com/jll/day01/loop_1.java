package com.jll.datone;
public class loop_1 {

	/**
	 * @author jlg
	 * 
	 */
	public static void main(String[] args) {
		Dayone dayone = new Dayone();
		int row = 10;
		dayone.triangle(row);
		dayone.linxing(row);
		dayone.chenfa();
		dayone.linxingnoborder(row);
//		Arrays.sort(a);
	}
}
class Dayone{
	public void linxingnoborder(int row){
		int hang = 2*row;
		for(int i = 0 ; i < hang ; i ++){
			for(int j = 0 ; j < row ; j ++){
				System.out.print(" ");
			}
			for(int j = 0 ; j <=i ; j ++){
				if(j==0 || j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			row--;
			i++;
		}
		row++;
		for(int i = hang-3 ; i >0 ; i --){
			for(int j = 0 ; j <= row ; j ++){
				System.out.print(" ");
			}
			for(int j = 0 ; j <i ; j ++){
				if(j==0 || j==i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			row++;
			i--;
		}
	}
	public void chenfa(){
		for (int i = 1 ; i <10 ; i++){
			for(int j = i ; j < 10 ; j ++){
				System.out.print(i + "*" + j + "=" + j*i +"\t");
			}
			System.out.println();
		}
	}
	public void linxing(int row){
		int hang =row*2;
		for(int i = 0 ; i <=hang+4 ; i ++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0 ; i < hang ;i++ ){
			System.out.println();
			for(int m = 0 ; m<row;m++){
				if(m==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				} 
			}
			System.out.print("  ");
			for(int j = 0 ; j <= i ; j ++){
				System.out.print("*");
			}
			System.out.print("  ");
			for(int n = 0; n<row;n++){
				if(n==row-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			row--;
			i++;
		}
//		row++;
		for(int i = hang - 3 ; i > 0 ; i--){
			System.out.println();
			for(int m = 0 ; m<=row+1 ; m++ ){
				if(m==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j = i ; j > 0 ; j--){
				System.out.print("*");
			}
			System.out.print("  ");
			for(int m = 0 ; m <=row+1;m++){
				if(m==row+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			row++;
			i--;
		}
		for(int i = 0 ; i <=hang+4 ; i ++){
			System.out.print("*");
		}
		System.out.println();
	}
	public void triangle(int row){
		int hang =row*2;
		for(int i = 0 ; i < hang ; i =i+2){
			System.out.print("  ");
			for(int m=0;m <row;m++){
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j ++){
				System.out.print("*");
			}
			row--;
			System.out.println();
		}
		System.out.println();
	}
}