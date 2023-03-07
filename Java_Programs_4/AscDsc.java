/* Write a java program to check if two numbers in a pairs is in ascending or descending order. */

import java.util.Scanner;

class AscDsc{

 public static void main(String [] args){
 
 Scanner sc = new Scanner(System.in);
 System.out.println("enter two integers");
 int num1 = sc.nextInt();
 int num2 = sc.nextInt();
 
 if(num1 < num2)
 {
   System.out.println("numbers are in ascending order");
 }
 else
 {
   System.out.println("numbers are in descending order");
 }
 }
}