/* Write a Java program tocreate a new array takin the first and last elements of a given array of integers and length one or more.*/

import java.util.Scanner;

class Program_16
{
   public static void main(String [] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int size = sc.nextInt();

    int [] a = new int [size];

    System.out.println("enter array");
     for(int i=0;i<size;i++)
     {
       a[i] = sc.nextInt();
     }
    /* for(int i=0; i<size;i++)
     {
      //  int b [ ]=a[i];
     }*/
     int b[] = {a[0],a[size-1]};
     System.out.print("b[] :");
     for(int i=0; i<b.length;i++)
      {
       System.out.print(" "+ b [i]);
     }
   }
}