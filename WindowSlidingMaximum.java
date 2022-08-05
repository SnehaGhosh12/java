package Array;
import java.util.Scanner;

public class WindowSlidingMaximum {
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int numbers[]=new int[size];
		for(int i=0;i<numbers.length;i++){
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the subarray length:");
		
		 int k=sc.nextInt();
		for(int i=0;i<numbers.length-k+1;i++){
	    int max=0;
	   
		for(int j=i;j<(i+k);j++){
			if(numbers[j]>max){
				max=numbers[j];
				}
		}
		System.out.print(max+" ");
		
	  }
		
   }
	
}
