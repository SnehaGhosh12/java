package Array;
import java.util.Scanner;
public class Max_Subarray {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int max=0;
			System.out.println("Enter the length of the array:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for (int i=0;i<n;i++){
				int sum=0;
				for(int j=i;j<n;j++){
					sum+=arr[j];
					if(sum>max){
 						max=sum;
						
					}
				}
			}
			System.out.println("The maximum number is :"+max);
			System.out.println("Max element is formed by adding:");
			int max2=max;
			for (int i=0;i<n;i++){
				int sum=0;
				for(int j=i;j<n;j++){
					sum+=arr[j];
					if(sum==max2){
						for(int k=i;k<=j;k++){
							System.out.print(arr[k]+" ");
						}
						
					}
				}
			}
			
		}
		
}