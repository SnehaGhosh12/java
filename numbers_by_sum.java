package Array;
import java.util.*;
public class numbers_by_sum {
	public static int findIndex(int n,int arr[],int x){
		for (int i=0;i<n;i++){
			
			int sum=0;
			for(int j=i;j<n;j++){
				sum+=arr[j];
				if(sum==x){
					System.out.println("Sum is given by adding:");
					for(int k=i;k<=j;k++){
					System.out.print(arr[k]+"  ");
					}
					
					return 0;
					
				}
							
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a sum:");
		int x=sc.nextInt();
		int result=findIndex(n,arr,x);
		if (result==-1){
			System.out.println("NOT FOUND");
		}
	}
	
}
