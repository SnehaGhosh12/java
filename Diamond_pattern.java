package Pattern;
import java.util.*;
public class Diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nuumber of rows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("* ");
			}			
			System.out.println();
		}
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("* ");
			}	
			System.out.println();
		}
		sc.close();
	}
}
