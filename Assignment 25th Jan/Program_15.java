/* Write a C program to check if a given array of integers contains a 3 or a 5. */

import java.util.Scanner;

class Program_15
{
  public static void main(String [] args)
  {
     int count =0;
     int count_1 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size = sc.nextInt();

    int [] arr = new int [size];
    System.out.println("enter array");
    for(int i =0;i<size;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i =0;i<size;i++)
        {

          if(arr[i]==3)
          {
			  count++;
			  // System.out.println("given array of integers contains a 3");
		  }
		  else
		  {
			  if(arr[i]==5)
			  {
				  count_1++;
				  //System.out.println("given array of integers contains a 5");
		      }

		  }
    }
    if(count >0)
      {
    System.out.println("given array of integers contains a 3"+count);
      }
    else
    {
		if(count_1>0)
		{
    System.out.println("given array of integers contains a 5"+count_1);
        }
        else
        {
			System.out.println("given array of integers does not contains a 3 or 5");
		}
    }

  }
}
