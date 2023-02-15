/* Write a Java  program that takes four numbers as input to calculate and print the average. */

import java.util.Scanner;

class Program_3_1
{
  public static void main(String [] args)
  {
     int sum ;
    double average;
     Scanner sc = new Scanner(System.in);

     System.out.println("enter first number");
     int num_1 = sc.nextInt();
     System.out.println("enter second number");
     int num_2 = sc.nextInt();
     System.out.println("enter third number");
     int num_3 = sc.nextInt();
     System.out.println("enter fourth number");
     int num_4 = sc.nextInt();

    sum = num_1 + num_2 + num_3 + num_4;

    average = sum /4;

     System.out.println("Average : "+average);
  }
}