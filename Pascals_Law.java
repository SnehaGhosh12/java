package Pattern;

import java.util.Scanner;

public class Pascals_Law{
	

 public static void main(String[] args) {
  // TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the row");
   int n = sc.nextInt();
   SolutionPascal(n);
 } 
 public static void SolutionPascal(int n) {
  Pascals_Law a = new Pascals_Law();
  System.out.println("Your pascal triangle is Ready:- ");
  for(int i=0;i<=n;i++) {
   for(int j =0;j<=n-i;j++) {
    System.out.print(" ");
   }
   for(int k=0;k<=i;k++) {
    System.out.print(a.factorial(i)/(a.factorial(i-k)*a.factorial(k))+" ");
   }
   System.out.println();
  }
 }
	
 private int factorial(int b) {
// upor a tui default mane direct int factorial (int b) kore o korte parti 
	 //kintu private korlam sudhu akhane ata k access korte parbi noile tui
	 //public korle jkono jaigai jkhn iche use korte parbi class call kore
	 
  if(b==0)
   return 1;
  // puchku r bojhar jonno factorial ta akhane venge dilam noile tui direct 
  //last comment a return ta use korte paris ota korle toke next 4 line korte
  //hbe na 31,32,33,34
  int c=1;
  for(int i =b;i>=1;i--) {
   c *=i;
  }
  
  return c;
  //return b*factorial(b-1);
 }
}
