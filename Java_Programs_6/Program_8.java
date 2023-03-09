/* Write a Java program to check a given array of integers and return true if the specified number of same elements
   appears at the start and end of the given array.*/

   import java.util.Scanner;

   class Program_8
   {
     public static void main(String [] args)
     {
		 Scanner sc  = new Scanner(System.in);

		 System.out.println("enter length of array");
        	int len  = sc.nextInt();

           int [] arr = new int[len];
       System.out.println("enter array");

       for(int i=0;i<len;i++)
       {
		    arr[i] =sc.nextInt();
	   }
       if(arr[0] == arr[len-1])
       {
         System.out.println("First element and last element are equal");
       }
       else
       {
        System.out.println("First element and last element are not equal");
       }
     }
   }

