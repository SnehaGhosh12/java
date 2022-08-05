package Array;

import java.util.Scanner;

public class TransposeofMatrix {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int a=sc.nextInt();
		System.out.print("Enter the number of column:");
		int b=sc.nextInt();
		System.out.println("Enter the elements:");
		int matrix[][]=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The transpose of tthe matrix is:");
		for (int i=0;i<b;i++){
			for(int j=0;j<a;j++){
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}

	}

}
