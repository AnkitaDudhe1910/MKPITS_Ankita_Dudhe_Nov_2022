/* Write a java program to check three given integers (small,medium,and large)
   and return true if the difference between small, medium and the difference
   between medium and large is same. */

   import java.util.Scanner;

class Program_10
{
  public static void main(String []  args)
  {
	int large=0;
	int medium=0;
	int small=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first integer");
    int num1 = sc.nextInt();
    System.out.println("enter second integer");
    int num2 = sc.nextInt();
    System.out.println("enter third integer");
    int num3 = sc.nextInt();

    if(num1>num2 && num1>num3)
    {
		large = num1;

		if(num2>num3)
		{
			medium = num2;
			small = num3;
		    System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
		}
		else
		{
			medium = num3;
			small = num2;
		    System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
		}
	}
	else
	{
		if(num2>num1 && num2>num3)
	     {
			large = num2;
			if(num1>num3)
		     	{
				 medium = num1;
				 small = num3;
				 System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
				}
			else
				{
			    medium = num3;
				small = num1;
			    System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
		         }
		   }

	   }


		   if(num3>num1 && num3>num2)
		    {
				large = num3;
				if(num1>num3)
		        	{
					 medium = num1;
					 small = num3;
					 System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
					}
				else
					{
				     medium = num3;
					 small = num1;
					 System.out.println("samll : "+small+"medium : "+medium+"large : "+large);
		            }
			 }

	  int diff_1 = medium-small;
	  int diff_2 = large-medium;
	  System.out.println("diff_1 : "+diff_1);
	  System.out.println("diff_2 : "+diff_2);
	  if(diff_1==diff_2)
	  {
		  System.out.println("difference is same");
	  }
  }
}