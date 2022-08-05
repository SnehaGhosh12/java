package Array;

import java.util.Scanner;

public class Find_x_2D_Array {
    private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.print("Enter the number of column:");
		int colm=sc.nextInt();
		int numbers[][]=new int[rows][colm];
		for (int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
				numbers[i][j]=sc.nextInt();
			}
			
		}
		for (int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
			System.out.print(numbers[i][j]+" ");
			//if(x==numbers[i][j])
			//System.out.println("The number is in index:"+(i+1)+","+(j+1)+"");
			}
			System.out.println();
		}
		System.out.print("Enter a number to find:");
		int x=sc.nextInt();
		for (int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
			if(x==numbers[i][j]){
			System.out.println(""+x+" is found at location: ("+(i+1)+","+(j+1)+")");
			}
		}
	 }	
		
  }
}
