//get a string and convert into half string . first half of string should be upper case and other part shouldbe lower case.

import java.util.Scanner;

class StringDemo
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter string");
     String s = sc.next();
     int len = s.length()/2;
     String s1 = s.substring(0,len);

     String s2 = s.substring(len);

     String s3 = s1.toUpperCase();
     String s4 = s2.toLowerCase();

     System.out.println(s3+s4);
  }
}