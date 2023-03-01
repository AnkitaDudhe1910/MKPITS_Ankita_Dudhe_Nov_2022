/* Write a java to check whether a character is an alphabet, digit or special character. */

import java.util.Scanner;

class CharaDigit
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a character");
    char c = sc.next().charAt(0);


    if((c >='a' && c <='z') ||(c >='A' && c <='Z'))
    {
		 System.out.println("character is alphabet ");
	}
	else
	{
		if(c >= '0' && c <= '9')
		{
			System.out.println("character is digit");
		}
		else
		{
			System.out.println("character is special character");
		}
	}
  }
}