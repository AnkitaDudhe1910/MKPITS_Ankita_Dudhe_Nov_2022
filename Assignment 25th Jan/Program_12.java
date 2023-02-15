/* Write a C program to check whether a given array of integers contains 5's and 7's. */

import java.util.Scanner;

class Program_12
{
  public static void main(String[] args)
  {
	  int count=0;
	  int count_1=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter length of array");
     int size = sc.nextInt();
     int [] arr = new int[size];
     System.out.println("enter array");
     for(int i=0;i<size;i++)
     {
		 arr[i] = sc.nextInt();
	 }
     for(int i=0;i<size;i++)
      {
 		// System.out.println(arr[i] );
 		 if(arr[i]==5)
 		 {
			 count++;
		 }
		 if(arr[i]==7)
	     {
		 	 count_1++;
		 }
	  }
	  System.out.println("given array of integers contains 5's are:"+count);
	  System.out.println("given array of integers contains 7's are: "+ count_1);
  }
}