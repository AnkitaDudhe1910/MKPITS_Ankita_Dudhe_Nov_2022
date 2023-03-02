/* find sum of positive numbers in array. */

import java.util.Scanner;

class SumPositive
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
     System.out.println("enter size of array");
      int size= sc.nextInt();
      int [] arr = new int [size];
      int sum = 0;
     System.out.println("enter array");
    
     for(int i=0; i<size;i++)
      {
        arr[i] = sc.nextInt();
      }
     for( int i=0; i<size;i++)
      {
        if(arr[i]>0)
         {
           sum = sum+arr[i];
         }
     } 
     System.out.println("sum of positive number in array : "+sum);
  }
}