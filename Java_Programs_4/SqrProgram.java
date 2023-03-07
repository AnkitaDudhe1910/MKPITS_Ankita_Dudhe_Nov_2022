/* Write a java program to find and print the square of each one of the even values from 1 to a specified value. */

import java.util.Scanner;

public class SqrProgram{
	public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   int num = sc.nextInt();
   int sqr=0;
   for(int i=1;i<=num;i++)
   {
     if(i%2==0){

      sqr = i*i;
      System.out.println(sqr);
     }
   }
}
}