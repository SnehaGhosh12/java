package Pattern;
import java.util.*;
public class String_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
    String n=sc.next();
    for(int i=1;i<=n.length();i++){
    	for(int j=1;j<=i;j++){
    		System.out.print(n.charAt(i-1));
    	}
    	System.out.println();
    }
	}

}
