/* Write a java program to convert specifiedvdays into years,weeks and days.*/

import java.util.Scanner;

class Conversion
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of days");
    int days = sc.nextInt();

    int years = days/365;
    int weeks = days/7;
    int remdays = days%7;
    System.out.println(years+" years "+weeks+" weeks "+remdays+" days");
  }
}