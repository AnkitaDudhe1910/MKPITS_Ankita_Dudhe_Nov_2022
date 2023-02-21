/* Write a java program that accepts an employees id, total worked hours of month and amount he recieved per hour
   print the employee id and salary(with two decimal palces) of a perticular month. */

   import java.util.Scanner;

   class Salary
   {
     public static void main(String [] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter employee id");
       int id = sc.nextInt();
       System.out.println("Enter employee total workde hours of month");
       float totalhrs = sc.nextFloat();
       System.out.println("Enter employee amount per hour");
       float perhrs = sc.nextFloat();

      float salary = totalhrs*perhrs;
      System.out.println("Employee id : "+id+" Employee Salary : "+salary);
     }
   }