package Array;

import java.util.Scanner;

public class TwoD_Array {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.print("Enter the number of coloumn:");
		int colm=sc.nextInt();
		int numbers[][]=new int[rows][colm];
		for(int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
				numbers[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();	
		}

	}

}
