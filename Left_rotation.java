package Questions;
import java.util.*;
public class Left_rotation {
	public static void rotation(int n,int arr[],int k){
     int i,j,temp;
     
     for(i=0;i<k;i++){
    	  temp=arr[0];
    	  for(j=0;j<n-1;j++){
    		  arr[j]=arr[j+1];
    	  }
    	  arr[j]=temp;
     }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n=sc.nextInt();
		System.out.print("Enter the number of rotation to be performed: ");
		int k=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		rotation(n,arr,k);
		System.out.println("The new array is: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
