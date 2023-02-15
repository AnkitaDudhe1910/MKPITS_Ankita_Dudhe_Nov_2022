/* Write a C program to check a given array of integers and return true
   if the value 5 appears 5 times and there are no 5 next to each other. */

  import java.util.Scanner;

   class Program_20
   {
     public static void main(String[] args)
     {
   	  int count = 0;
   	  boolean check=false;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter size of array");
       int size = sc.nextInt();

       int [] arr = new int [size];
       System.out.println("enter array");
       for(int i=0;i<size-1;i++)
           {
             arr[i] = sc.nextInt();
           }
       for(int i=0;i<size-1;i++)
           {
             if(arr[i]==5 && arr[i+1]!=5)
             {
                count++;
                check = true;
             }


           }
        if(count == 5)
        {
          System.out.println("the value 5 appears 5 times and there are no 5 next to each other :"+check);
        }
        else
        {
          System.out.println("the value 5 does not appears 5 times and there are 5 next to each other.");
        }

       }
   }
