/* Write a program in java to remove characters in string except alphabets. */

import java.util.Scanner;

class Remove{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.next();
    int count1=0;
    int count2=0;

    char c [] = str.toCharArray();
    for(int i =0; i<c.length;i++)
    {


      if(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z'){

           System.out.print(c[i]);
      }
    }
  }
}