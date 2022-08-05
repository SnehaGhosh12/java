package Pattern;
import java.util.*;
public class Number_pyramid_special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int number=0;
		for(int i=1;i<=n;i++){
			number=number+i;
			
				for(int j=number;j>number-i;j--){
					
					System.out.print(j+" ");	
					
					}System.out.println();
			}
	
	}
		
}
