//Armstrong number in java

import java.util.Scanner;

class Armstrong
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    int temp = num;
    int a =0;
    while(num>0)
    {
      int b = num%10;
      a = a+(b*b*b);

      num=num/10;
    }

    if(temp == a)
    {
	  System.out.println("number is armstrong");
	}
	else
	{
		 System.out.println("number is not armstrong");
	}
  }
}