package Pattern;
import java.util.*;
public class inverseHalfpyramidOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=0;j<=r-i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}
}
