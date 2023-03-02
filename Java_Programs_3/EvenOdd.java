/* Display even and odd numbers in an array. */

import java.util.Scanner;

class EvenOdd
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter size of array");
       int size= sc.nextInt();
       int [] arr = new int [size];
       System.out.println("enter array");
        for(int i=0; i<size;i++)
         {
           arr[i] = sc.nextInt();
         }
        for( int i=0; i<size;i++)
         {
           if(arr[i]%2==0)
            {
              System.out.println("even number :"+arr[i]);
            }
            else
            {
              System.out.println("odd number :"+arr[i]);
            }
         }
    }

}