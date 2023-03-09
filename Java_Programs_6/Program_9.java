/*  Write a C program to check if the value of each element is equal or greater than the value of
    previous element of a given array of integers. */

   import java.util.Scanner;

    class Program_9
    {
      public static void main(String [] args)
      {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("enter length of array");
		 int len = sc.nextInt();

        int [] arr = new int[len];
        System.out.println("enter array");
        int diff=0;
        for(int i=0; i<len;i++)
        {
			 arr[i] = sc.nextInt();
		}
        try{
        for(int i=0;i<arr.length;i++)
        {
         diff = arr[i+1]-arr[i];
         if(diff>0)
         {
           System.out.println(arr[i+1]+" is greater than prevoius element");
         }
         else
         {
         if(diff==0)
         {
            System.out.println(arr[i+1]+" is equal to prevoius element");
         }
         else
         {
             System.out.println(arr[i+1]+" is smaller than prevoius element");
         }
         }
        }
	   }catch(Exception e){ }
      }
    }