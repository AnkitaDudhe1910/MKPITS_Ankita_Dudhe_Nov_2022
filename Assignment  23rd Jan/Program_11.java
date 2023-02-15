/* Write a java program to check a given array of integers of length 1 or more and return true if the first element
and the last element are equal in the given array. */

import java.util.Scanner;

class Program_11
{
  public static void main(String [] args)
  {
	  boolean check = false;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter array size");
	  int size = sc.nextInt();

	  int [] a = new int [size];
	  System.out.println("enter array");
	  for(int i=0;i<size;i++)
	  {
		  a[i] = sc.nextInt();
	  }

	  	  if(a[0]==a[size-1])
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