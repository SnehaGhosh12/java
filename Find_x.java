package Array;
import java.util.*;
public class Find_x {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int input[]=new int[size];
		for(int i=0;i<size;i++){
			input[i]=sc.nextInt();
			}

		System.out.print("Enter a number to search:");
	     	int x=sc.nextInt();
		for(int j=0;j<input.length;j++){
			if(input[j]==x){
				System.out.print("The number is found at:"+(j+1));
			}
		}
	}
}



