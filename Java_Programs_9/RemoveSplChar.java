/* java program to replace the string space with a given character. */

import java.util.Scanner;

class RemoveSplChar
{
  static void remove()
  {
	  Scanner sc = new Scanner(System.in);
	    System.out.println("enter string");
	    String str = sc.nextLine();
	    System.out.println("enter character for replace");
	    char spc = sc.next().charAt(0);
     char [] c = str.toCharArray();
     for(int i=0;i<c.length;i++)
     {
       if(c[i]==' ')
       {
         c[i] = spc;
       }
     }
     for(int i=0;i<c.length;i++)
       {
         System.out.print(c[i]);
      }
  }
  public static void main(String [] args)
  {
      remove();
  }
}