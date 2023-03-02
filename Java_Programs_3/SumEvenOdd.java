/* sum of even and odd numbers in an array. */

import java.util.Scanner;

class SumEvenOdd
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter size of array");
       int size= sc.nextInt();
       int [] arr = new int [size];
      int sum1=0, sum2=0;
     System.out.println("enter array");
     for(int i=0; i<size;i++)
      {
        arr[i] = sc.nextInt();
      }
     for( int i=0; i<size;i++)
      {
        if(arr[i]%2==0)
       {
         sum1=sum1+arr[i];
       }
        else
        {
         sum2=sum2+arr[i];
        }
      }
      System.out.println("sum of even numbers is : "+sum1);
      System.out.println("sum of odd numbers is : "+sum2);

    }

}