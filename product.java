package Questions;
import java.util.*;
public class product {
	public static void discount(int n,int price[],int avail[],int scu[]){
		for(int i=0;i<n;i++){
			if(scu[i]>0){
				System.out.println(avail[i]*price[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[]=new int[n];
		int avail[]=new int[n];
		int scu[]=new int[n];
		for(int i=0;i<n;i++){
			price[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			avail[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			scu[i]=sc.nextInt();
		}
		discount(n,price,avail,scu);
	}

}
