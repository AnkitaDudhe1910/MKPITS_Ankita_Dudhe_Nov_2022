/* Write a C program to check if the sum of all 5' in the array exactly 15 in a given array of integers. */

import java.util.Scanner;
class Program_13
{
 public static void main(String [] args)
 {
	 int sum=0;
   Scanner sc = new Scanner(System.in);

   System.out.println("enter size of array");
   int size = sc.nextInt();

   int [] arr = new int[size];

   System.out.println("enter array");

   for(int i=0;i<size;i++)
   {
     arr[i] = sc.nextInt();
   }
   for(int i=0;i<size;i++)
      {
        //System.out.println(arr[i]);
        if(arr[i]==5)
        {
			sum = sum+arr[i];
		}
     }

     if(sum == 15)
     {
		 System.out.println("the sum of all 5' in the array exactly 15");
	 }
	 else
	 {
		 System.out.println("the sum of all 5' in the array not 15");
	 }
 }
}