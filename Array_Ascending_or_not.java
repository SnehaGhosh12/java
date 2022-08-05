package Array;

import java.util.Scanner;

public class Array_Ascending_or_not {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc= new Scanner(System.in);
		System.out.print("Enter the number of terms:");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}
		boolean isAscending=true;
		for(int i=0;i<numbers.length-1;i++){
			if(numbers[i]>numbers[i+1]){
				isAscending=false;
			}
		}
		if(isAscending){
			System.out.print("The array is in ascendind order");
		}
		else{
			System.out.print("The array is not in ascending order");
		}

	}

}
