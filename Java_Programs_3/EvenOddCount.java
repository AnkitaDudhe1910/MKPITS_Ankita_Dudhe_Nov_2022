/* count even and odd numbers in an array. */

import java.util.Scanner;

class EvenOddCount
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter size of array");
       int size= sc.nextInt();
       int [] arr = new int [size];
      int count1 =0, count2=0;
     System.out.println("enter array");
     for(int i=0; i<size;i++)
      {
        arr[i] = sc.nextInt();
      }
     for( int i=0; i<size;i++)
      {
        if(arr[i]%2==0)
       {
         count1++;
       }
        else
        {
         count2++;
        }
      }
      System.out.println("total even numbers are : "+count1);
      System.out.println("total odd numbers are : "+count2);

    }

}