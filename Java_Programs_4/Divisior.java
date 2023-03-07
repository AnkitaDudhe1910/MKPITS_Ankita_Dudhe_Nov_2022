/* Write a C program that reads an integer and find all its divisor. */

import java.util.Scanner;

class Divisior{

public static void main(String [] args){

  Scanner sc = new Scanner(System.in);

  System.out.println("enter integer");

  int num = sc.nextInt();

  for(int i=1;i<=num;i++){

  if(num%i==0){

  System.out.print(" "+i);
  }
  }
}
}