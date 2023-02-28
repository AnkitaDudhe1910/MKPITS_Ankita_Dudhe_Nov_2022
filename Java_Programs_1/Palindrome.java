//Palindrome program in java

import java.util.Scanner;

class Palindrome
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    int b = 0;
    int number = num;
    while(num>0)
    {
      int a = num%10;

      b = (b*10)+a;

      num = num/10;

    }

     if(b==number)
	   {
	    System.out.println("number is palindrome");
	   }
	 else
	   {
	    System.out.println("number is not palindrome");
	  }
  }
}