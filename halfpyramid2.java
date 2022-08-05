package Pattern;

import java.util.Scanner;
public class halfpyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a=sc.nextInt();
		for (int i=1;i<=a;i++){
			for(int j=1;j<=a-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}