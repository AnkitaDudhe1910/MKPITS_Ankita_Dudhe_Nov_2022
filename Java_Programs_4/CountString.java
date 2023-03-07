/* Write a program in java to count of each  characters in string. */

import java.util.Scanner;

class CountString{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.next();
    int count = str.length();
   System.out.println("count of character in string is "+count);
  }
}