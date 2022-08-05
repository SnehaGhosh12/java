package Array;

import java.util.Scanner;

public class distinct_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array:");

		int size=sc.nextInt();
		
		int arr[]=new int[size];
		int count=0;
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					j=j+1;
					count++;
				}
				
			}
		}
		System.out.println(count+" element are repeated");
	}

}
