package Pattern;
import java.util.*;
public class Solid_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length:");
		int a= sc.nextInt();
		System.out.print("Enter the breadth:");
		int b= sc.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
        sc.close();
	}

}
