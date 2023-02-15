/* Write a C program to check a given array of integers and return true if the given array
  contains two 5's next to each other, or two 5 separated by one element. */

import java.util.Scanner;

  class Program_17
  {
    public static void main(String[] args)
    {
       int count=0;
       int count_1=0;
       boolean check = false;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of array");
      int size = sc.nextInt();

      int [] arr = new int [size];
      System.out.println("enter array");
      for(int i = 0;i<size;i++)
      {
        arr[i] = sc.nextInt();
      }
      for(int i = 0;i<size-1;i++)
      {

        if(arr[i]==5 && arr[i+1]==5)
        {
          count ++;
          check=true;
        }
        else
        {
         if(arr[i]==5 && arr[i+1]!=5 && arr[i+2]==5)
         {
           count_1 ++;
           check = true;
         }
	 }



      }
      if(count>0)
      {
		   System.out.println("given array contains two 5's next to each other"+check);
	  }
	  else
	  {
		  if(count_1>0)
		  {
			   System.out.println("given array contains two 5 separated by one element."+check);
		  }
		  else
		  {
			   System.out.println("given array does not  contains two 5's next to each other, or two 5 separated by one element."+check);
	      }
	  }
    }
  }