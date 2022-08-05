package Array;
import java.util.*;
public class Min_ValueAndMax_Value {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int size= sc.nextInt();
		System.out.println("Enter the elements:");
		int numbers[]= new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]<min){
				min=numbers[i];
	      	}
			if(numbers[i]>max){
				max=numbers[i];
			}
		}
			System.out.println("The largerst number is: "+max);
			System.out.println("The smallest number is: "+min);
	}

}
