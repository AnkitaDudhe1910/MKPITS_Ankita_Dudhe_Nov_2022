/*Write a C program to compute the sum of values in a given array of integers except the number 17.
  Return 0 if the given array has no integer.*/

  import java.util.Scanner;
  class Program_9
  {

    	public static void main(String [] args)
    	{
  		  int sum=0;
    	  Scanner sc  = new Scanner(System.in);
    	  System.out.println("enter size of array");
    	  int size = sc.nextInt();


    	  int[] arr = new int[size];
    	System.out.println("Enter the elements of the array:");

   for(int i=0;i<size;i++)
   {
  	  arr[i] = sc.nextInt();


   }
   for(int i=0;i<size;i++)
    {
   	  if(arr[i]==17)
   	  {

	  }
	  else
	  {
          sum = sum +arr[i];
	  }
   }
   System.out.println(sum);
  }
}