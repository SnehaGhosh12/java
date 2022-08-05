package Pattern;
import java.util.Scanner;

public class pascalsLaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r=sc.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<=r-i;j++){
				System.out.print(" ");
			}
			int number=1;
			for(int k=0;k<=i;k++){
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);		
			}
			System.out.println();
		}
	}
}
