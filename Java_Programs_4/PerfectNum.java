/* Write a java program to check whether a givennumber is a perfect number or not. */

import java.util.Scanner;

class PerfectNum{
  public static void main(String [] args){

   Scanner sc = new Scanner(System.in);

   System.out.println("enter number");

   int num = sc.nextInt();

   int sum =1;

   for(int i=1;i<num;i++){

    if(num%i == 0)
    {
		sum = sum*i;

	}
   }
   if(sum == num){
      System.out.println(num +" is perfect number");
   }
   else
   {
       System.out.println(num +" is not perfect number");
   }
  }
}