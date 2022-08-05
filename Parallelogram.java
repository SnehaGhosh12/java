package Pattern;
import java.util.*;
public class Parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the side of the parallelogram:");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
    	 for(int j=1;j<=n-i;j++){
    		 System.out.print("  ");
    		 }
    	 for(int k=1;k<=n;k++){
    		 System.out.print("* ");
    	 }
    	 System.out.println();
     }
     sc.close();

   }
}
