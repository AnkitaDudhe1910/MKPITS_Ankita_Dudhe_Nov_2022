/* Write a C program to check if an array of integers contains a 3 next to a 3 or a 5 next to a 5 or both. */

import java.util.Scanner;
class Program_16
{
  public static void main(String [] args)
  {
	  boolean check = false;
	  int count=0;
	  int count_1 =0;
	  int count_2 =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int size = sc.nextInt();

	int [] arr = new int[size];
	System.out.println("enter value");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			if(arr[i]==3 && arr[i+1]==3)
			{
				check = true;
				count++;
				System.out.println(check);
			}
			else
			{
			if(arr[i]==5 && arr[i+1]==5)
					{
							check = true;
							count_1++;
							System.out.println(check);
			          }
			          else
			          {
						  if((arr[i]==3 && arr[i+1]==3) && (arr[i]==5 && arr[i+1]==5))
						  {
							  check = true;
							  count_2++;
						  }
					  }
	        }
         }
         if(count >0)
         {
			System.out.println("an array of integers contains a 3 next to a 3 "+check);
		 }
		 else
		 {
			 if(count_1>0)
			   {
			 	System.out.println("an array of integers contains a 5 next to a 5 "+check);
		       }
		       else
		       {
				  if(count_2>0)
				      {
				    	System.out.println("an array of integers contains a 3 next to a 3 and 5 next to a 5"+check);
		              }
		              else
		              {

						System.out.println("an array of integers does not contains a 3 next to a 3 and 5 next to a 5"+check);

					  }
			   }
		 }
  }
}