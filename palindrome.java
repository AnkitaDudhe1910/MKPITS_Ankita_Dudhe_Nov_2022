import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
System.out.println("enter your name");
  String name =sc.next();
  StringBuffer str = new StringBuffer(name);
  str.reverse();

  //String rev = str.toString();

  // String rev = new String(str);

 // System.out.println(rev);

  if(name.contentEquals(str))
  {
	   System.out.println("palindrome");

  }
  else
  {
	  System.out.println("not palindrome");
  }

/* int c = name.compareTo(rev);
System.out.println(c);
if( c == 0)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
*/

/*  if(name.equals(rev))
  {
   System.out.println(" it is palindrome");
  }
  else
  {
  System.out.println("not palindroome");
  }*/
}
}
