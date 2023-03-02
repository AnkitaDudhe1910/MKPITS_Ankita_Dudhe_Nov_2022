/* Reverse String in java. */

import java.util.Scanner;

class RevStr
{
  public static void main(String [] args)
  {
	 Scanner sc = new Scanner(System.in);
    String str = sc.next();

    char [] c = str.toCharArray();

    for(int i=str.length()-1;i>=0;i--)
    {
		 System.out.print(c[i]);
    }

  }
}