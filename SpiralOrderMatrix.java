package Array;

import java.util.Scanner;

public class SpiralOrderMatrix {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int a=sc.nextInt();
		System.out.print("Enter the number of columns:");
		int b=sc.nextInt();
		
		int matrix[][]=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The spiral matrix is :");
		int row_start=0;
		int row_end=a-1;
		int colm_start=0;
		int colm_end=b-1;
		
		while(row_start<=row_end && colm_start<=colm_end){
			
				for(int col=colm_start;col<=colm_end;col++){
					System.out.print(matrix[row_start][col]+" ");
				}
				row_start++;
				
				for(int row=row_start;row<=row_end;row++){
					System.out.print(matrix[row][colm_end]+" ");
				}
				colm_end--;
				
				
				for(int col=colm_end;col>=colm_start;col--){
					System.out.print(matrix[row_end][col]+" ");
				}
				row_end--;
				
				for(int row=row_end;row>=row_start;row--){
					System.out.print(matrix[row][colm_start]+" ");
				}
				colm_start++;
				
				
			}
		
		}

	}


