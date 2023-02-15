/* Write a program in Java to read any day number in integer and display day name in the word. */

import java.util.Scanner;

class Program_24_1
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter day in number");
     int day = sc.nextInt();
     switch(day)
     {
     case 1: 
            System.out.println("MONDAY");
            break;
     case 2: 
	    System.out.println("TUESDAY");
            break;
     case 3: 
            System.out.println("WEDNSDAY");
            break;
     case 4: 
            System.out.println("THURSDAY");
            break;
     case 5: 
            System.out.println("FRIDAY");
            break;
     case 6: 
            System.out.println("SATURDAY");
            break;
     case 7:   
            System.out.println("SUNDAY");
            break;
      default :
        System.out.println("there are only 7 days");
     }
   }
}