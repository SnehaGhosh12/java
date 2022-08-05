package Array;
import java.util.*;
public class Array_of_names {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int size=sc.nextInt();
		String names[]=new String[size];
		for(int i=0;i<size;i++){
			names[i]=sc.next();
			
		}
		for(int i=0;i<names.length;i++){
			System.out.println("name"+(i+1)+"is:"+names[i]);
		}

	}

}
