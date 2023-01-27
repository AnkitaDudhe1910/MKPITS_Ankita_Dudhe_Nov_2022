// Write a java program to copy a given string into another and count the number of characters copied.

import java.util.Scanner;

class assignment
{
  String one , two;

  void copyString()
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("enter any string");
     one = sc.next();
     System.out.println("given string is:"+one);

     two = one;
     System.out.println("string is copy in another string : "+two);

     System.out.println("number of copied characters are : "+ two.length());
  }

}
class Program_13
{
  public static void main(String []args)
  {
    assignment ob = new assignment();
    ob.copyString();
  }
}