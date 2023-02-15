/* Write a C program to check a given array of integers and return true if there is a 3 with a 5 somewhere later
   in the given array.*/

import java.util.Scanner;

class Program_18
{
  public static void main(String [] args)
  {
     int count = 0;
     boolean check = false;
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
       if(arr[i]==3 && arr[i+1]==5)
       {
         count++;
         check = true;
       }
    }
    if(count >0)
    {
      System.out.println("given array contains 3 with a 5 is : "+check);
    }
    else
    {
      System.out.println("given array does not contains 3 with a 5 is : "+check);
    }

  }
}