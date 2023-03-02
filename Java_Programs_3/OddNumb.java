/* Remove odd number from an array in java. */

import java.util.Scanner;

class OddNumb
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
              System.out.print(" "+arr[i]);
            }
         }
    }

}