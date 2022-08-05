package Array;
import java.util.*;
public class Array_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int arr3[]=new int[size1+size2];
		System.out.print("Enter the elements of array 1:");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the elements of array 2:");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){
			  if(arr1[i]==arr2[j]){
				  System.out.println();
			  } 
		   }
			
		}
		


}

}
