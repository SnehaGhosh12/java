package Pattern;
import java.util.*;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=a-i;j++){
				System.out.print(" ");
		      }
			for(int k=1;k<=i+2;k++){
				System.out.print("* ");
			}
			for(int j=2*(a-i);j>=1;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i+2;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=a+2;i>=1;i--){
			for(int j=1;j<=a+2-i;j++){
				System.out.print("  ");
		      }
			for(int k=1;k<=2*i;k++){
				System.out.print("* ");
				}
			System.out.println();
				}
			sc.close();
           }
}			