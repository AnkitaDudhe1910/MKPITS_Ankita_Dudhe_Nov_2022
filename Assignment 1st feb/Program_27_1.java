/* Write a program in java to read any Month Number in integer and display the number of days for this month. */

import java.util.Scanner;

class Program_27_1
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Month in number");
     int month = sc.nextInt();
     switch(month)
     {
     case 1:
            System.out.println("JANUARY");
            System.out.println("Number of days: 31");
            break;
     case 2:
	    System.out.println("FEBRUARY");
	    System.out.println("Number of days: 28 and in leap year : 29");
            break;
     case 3:
            System.out.println("MARCH");
            System.out.println("Number of days: 31");
            break;
     case 4:
            System.out.println("APRIL");
            System.out.println("Number of days: 30");
            break;
     case 5:
            System.out.println("MAY");
            System.out.println("Number of days: 31");
            break;
     case 6:
            System.out.println("JUNE");
            System.out.println("Number of days: 30");
            break;
     case 7:
            System.out.println("JULY");
            System.out.println("Number of days: 31");
            break;
     case 8:
           System.out.println("AUGUST");
           System.out.println("Number of days: 31");
           break;
     case 9:
           System.out.println("SEPTMBER");
           System.out.println("Number of days: 30");
           break;
     case 10:
           System.out.println("OCTOBER");
           System.out.println("Number of days: 31");
           break;
     case 11:
           System.out.println("NOVEMBER");
           System.out.println("Number of days: 30");
           break;
     case 12:
           System.out.println("DECEMBER");
           System.out.println("Number of days: 31");
           break;
      default :
          System.out.println("there are only 12 month");
     }
   }
}