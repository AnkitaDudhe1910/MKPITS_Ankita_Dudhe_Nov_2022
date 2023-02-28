//Prime number for single input

import java.util.Scanner;

class PrimeNumber
{
  public static void main(String [] args)
  {
  Scanner sc = new Scanner(System.in);

  System.out.println("enter number");

      int num=sc.nextInt();
      int count=0;
      for(int i=2;i<num;i++)
      {
        if(num%i==0)
        {
        count++;
        }
      }
      if(count > 0)
      {
		   System.out.println(num +" is not prime number");
	  }
	  else
	  {
		  System.out.println(num +" is  prime number");
	  }
  }
}