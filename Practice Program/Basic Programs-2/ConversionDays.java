/* Write a program to enter a integer number in days and convert to year month and days
   assume all months have 30 days and years have 365 days. */

import java.util.Scanner;

class ConversionDays
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter days to convert in year,months and days");
    int days = sc.nextInt();

    int year = days/365;
    days = days%365;

    int month = days/30;
    days = days%30;

    int day = days;

    System.out.println(year +" years "+month+" months "+day+" days ");


  }
}