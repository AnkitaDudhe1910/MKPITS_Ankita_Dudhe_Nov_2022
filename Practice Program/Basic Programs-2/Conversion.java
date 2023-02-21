/* Write a program to convert a given integer into hours, minute and second. */

import java.util.Scanner;

class Conversion
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter integer in seconds");
    int seconds = sc.nextInt();

    int min=0;
    int sec=0;
    int hr=0;
    int minute=0;

    if(seconds >=60)
    {
	  min = seconds/60;
	  sec = seconds%60;

	}
	if(min>=60)
	{
		hr = min/60;
		minute =min%60;
		System.out.println(hr+" hours "+minute+" min "+sec+" seconds ");
	}
	else
	{
		System.out.println(hr+" hours "+minute+" min "+sec+" seconds ");
	}
  }
}