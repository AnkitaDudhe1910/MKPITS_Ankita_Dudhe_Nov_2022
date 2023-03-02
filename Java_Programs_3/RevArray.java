/* reverse array. */

import java.util.Scanner;

class RevArray
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
     for( int i=size-1;i>=0;i--)
      {
     System.out.print(" "+arr[i]);
    }
}
}