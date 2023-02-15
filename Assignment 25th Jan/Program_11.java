// Write a C program to check if a given array of integers contains 5 next to a 5 somewhere.

import java.util.Scanner;

class Program_11
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the length of array");
     int size = sc.nextInt();
     int [] arr = new int[size];
     boolean check = false;
     System.out.println("enter array");
     for(int i=0;i<size;i++)
     {
		 arr[i]=sc.nextInt();
	 }
     for(int i = 0; i < size;i++)

     {

    try{
       if(arr[i]==5 && arr[i+1]==5)
       {
         check = true;
         System.out.println("array of integers contains 5 next to a 5 somewhere : "+check);
       }

   }
   catch(ArrayIndexOutOfBoundsException e)
   {
   }
     }

  }
}