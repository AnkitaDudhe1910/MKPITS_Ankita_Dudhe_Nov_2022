 /* Write a C program to check if the number of 3's is greater than the number of 5's. */

import java.util.Scanner;

class Program_14
{
  public static void main(String[] args)
  {
	  int count = 0;
	  int count_1 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size = sc.nextInt();

    int [] arr = new int[size];
    System.out.println("enter array");
    for(int i = 0;i< size;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i = 0;i< size;i++)
        {
			if(arr[i]==3)
			{
				 count++;
			}
            else
            {
				if(arr[i]==5)
				{
					 count_1++;
				}
			}
         }
       if(count>count_1)
       {
		   System.out.println("3's is greater than the number of 5's");
	   }
	   else
	   {
		   System.out.println("5's is greater than the number of 3's");
	   }
  }
}