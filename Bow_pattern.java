package Pattern;

import java.util.Scanner;

public class Bow_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the  number of rows:");
	   int n=sc.nextInt();
	   for(int i=1;i<=n;i++){
		   for(int k=1;k<=i;k++){
			   System.out.print("* ");
		   }
		   for(int j=1;j<=2*(n-i);j++){
			   System.out.print("  ");
			   
		   }
		   for(int k=1;k<=i;k++){
			   System.out.print("* ");
		   }
		   System.out.println();
		   
	   }
	   for(int i=n;i>=1;i--){
		   for(int k=1;k<=i;k++){
			   System.out.print("* ");
		   }
		   for(int j=1;j<=2*(n-i);j++){
			   System.out.print("  ");
			   
		   }
		   for(int k=1;k<=i;k++){
			   System.out.print("* ");
		   }
		   System.out.println();
		   
	   }
	   sc.close();
	}

}
