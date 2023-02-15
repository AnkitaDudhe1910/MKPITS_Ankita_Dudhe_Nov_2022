/* Write a C program to check a given array of integers and return true if the given array
  contains either 2 even or 2 odd values all next to each other. */

  import java.util.Scanner;

class Program_19
{
  public static void main(String[] args)
  {
	  int count = 0;
	  int count_1=0;
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
           if(arr[i]%2==0 && arr[i+1]%2==0)
           {
             count++;
             check = true;
           }
           else
           {
             if(arr[i]%2!=0 && arr[i+1]%2!=0)
	       {
	         count_1++;
	         check = true;
               }

           }
         }
         if(count >0)
         {
          System.out.println("given array contains 2 even values next to each other : "+check);
         }
         else
         {
           if(count_1>0)
           {
            System.out.println("given array contains 2 odd values next to each other : "+check);
           }
           else
           {
            System.out.println("given array does not contains either 2 even or 2 odd values all next to each other : ");
           }
         }
  }
}