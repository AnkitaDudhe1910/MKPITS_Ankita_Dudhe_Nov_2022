/* Write a C program to compute the sum of the numbers in a given array except those numbers starting
   with 5 followed by atleast one 6. Return 0 if the given array has no integer. */
import java.util.Scanner;
class Program_10
{
  public static void main(String [] args)
  {
	  int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size");
     int size = sc.nextInt();
     int arr[] = new int[size];
     System.out.println("enter array");
     for(int i =0;i<size;i++)
     {
       arr [i] = sc.nextInt();
     }
     for(int i = 0;i<size;i++)
     {
		 if(arr[i]!=5 && arr[i]!=6)
		 {
		// System.out.println("After skipping 5 and 6 element in array "+arr[i]);
		     sum =sum+arr[i];
	     }
	 }
    System.out.println("Sum of array except 5 and 6 is:"+sum);
  }

}