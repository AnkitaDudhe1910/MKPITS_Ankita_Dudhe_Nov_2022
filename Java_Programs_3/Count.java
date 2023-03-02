/* count positive, negative and zero from array. */

import java.util.Scanner;

class Count
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);

      System.out.println("enter size of array");
        int size= sc.nextInt();
        int [] arr = new int [size];
        int count_1 = 0,count_2 = 0,count_3 = 0;
       System.out.println("enter array");

        for(int i=0; i<size;i++)
          {
            arr[i] = sc.nextInt();
          }
         for( int i=0; i<size;i++)
          {
            if(arr[i]>0)
             {
               count_1++;
             }
             else if(arr[i]<0)
             {
                count_2++;
             }
             else
             {
                count_3++;
             }
         }
     System.out.println("total positive number are : "+ count_1);
     System.out.println("total positive number are : "+ count_2);
     System.out.println("total positive number are : "+ count_3);
  }
}