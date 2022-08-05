package Pattern;
import java.util.*;

public class Alphabet_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int alphabet=65;
      System.out.print("Enter number of rows:");
      int n=sc.nextInt();
      
      for(int i=0;i<=n;i++){
    	  for(int j=0;j<=i;j++){
    		  System.out.print((char)(alphabet+j)+" ");
    	  }System.out.println();
      }
	}

}
