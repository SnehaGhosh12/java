package Pattern;

import java.util.Scanner;

public class Full_pyramid {
	
	public static void main(String[] args){
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	int a=sc.nextInt();
	for (int i=1;i<=a;i++){
		for(int j=1;j<=a-i;j++){
			System.out.print(" ");
	      }
		for(int k=1;k<=i;k++){
			System.out.print("* ");
		}
		System.out.println();
	  }
      sc.close();
	}
}

