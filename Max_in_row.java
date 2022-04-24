package Questions;
import java.util.*;
public class Max_in_row {
	public static void sum(int r,int c,int arr[][]){
		for(int i=0;i<r;i++){
			int max=0;
			for(int k=0;k<c;k++){
			  int sum=0;
			  for(int j=k;j<c;j++){
				sum+=arr[i][j];
				if(sum>max){
					max=sum;
				}
			}
			 
		} System.out.println("Max sum of "+i+" row is"+max);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int r=sc.nextInt();
		System.out.print("Enter no of cols: ");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.print("Enter the matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for (int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sum(r,c,arr);
	}

}
