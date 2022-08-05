package Pattern;
import java.util.*;
public class Square_border {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number length:");
		int a=sc.nextInt();
		System.out.print("Enter the  breadth:");
		int b=sc.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				if(i==1||i==a||j==1||j==b){
				System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		sc.close();
	}

}
