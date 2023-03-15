/* Write a method in java which will remove any given character from a string. */

import java.util.Scanner;

class RemoveChara
{
  static void remove()
  {
	  Scanner sc = new Scanner(System.in);
	    System.out.println("enter string");
	    String str = sc.next();
	    System.out.println("enter character to remove");
	    char rem = sc.next().charAt(0);
     char [] c = str.toCharArray();
     for(int i=0;i<c.length;i++)
     {
       if(c[i]!=rem)
       {
        System.out.print(c[i]+" ");
       }
     }
  }
  public static void main(String [] args)
  {
      remove();
  }
}