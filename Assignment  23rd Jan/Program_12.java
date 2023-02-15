/* Write a java program to check two given arrays of integers of length 1 or more and return true if they
   have the same first element or they have the same element.*/

import java.util.Scanner;

class Program_12
{
  public static void main(String [] args)
  {
	  boolean check = false;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter size of array");
	  int size = sc.nextInt();
	  int [] a = new int [size] ;
	  int [] b = new int [size] ;
	  System.out.println("enter first array");
	  for(int i = 0;i<size;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  System.out.println("enter second array");
	   for(int i = 0;i<size;i++)
	  {
	      b[i]=sc.nextInt();
	  }
	 if(a[0]==b[0] && a[size-1]==b[size-1])
	 {
		  check = true;
		  System.out.println(check);
	 }
	 else
	 {
		 System.out.println(check);
	 }
  }
}