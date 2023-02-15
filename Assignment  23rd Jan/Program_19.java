/*twice a Java program to check a given array of integers and return true if the array contains 10 or 20 twice.
  The length of the array will be 0,1,2.*/

import java.util.Scanner;

class Program_19
{
  public static void main(String [] args)
  {
	   int count=0;
	   int count_1=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size = sc.nextInt();
    int [] a = new int[size];
    System.out.println("enter array");
    for(int i=0;i<size;i++)
    {
       a[i] = sc.nextInt();
    }
    for(int i=0;i<size;i++)
    {
     // System.out.println(a[i]);
      if(a[i]==10 )
      {
        count++;
      }
      if(a[i]==20)
      {
         count_1++;
      }
    }
    if(count == 2)
    {
       System.out.println("the array contains 10  twice");
    }
    else
    {
        System.out.println("the array not contains 10 twice");
    }
    if(count_1==2)
    {
        System.out.println("the array contains  20 twice");
    }
    else
    {
        System.out.println("the array not contains 20 twice");
    }
  }
}