/* Write a program having string find the number of all uppercase, lowercase,digits,space and special character. */

import java.util.Scanner;

class Program_7
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter string");

    String s = sc.nextLine();

     char [] c = s.toCharArray();

    int upr=0, lwr=0, spc=0,dig=0, spl=0;

     for(int i=0;i<c.length;i++)
     {
		 if(c[i]>='A' && c[i] <='Z')
		 {
			  upr++;
		 }
		 else
		 {
			 if(c[i]>='a' && c[i] <='z')
			 {
				 lwr++;
			 }
			 else
			 {
				 if(c[i]>='0' && c[i] <='9')
				 {
					 dig++;
				 }
				 else
				 {
					 if(c[i]==' ')
					 {
						 spc++;
					 }
					 else
					 {
						 spl++;
					 }
				 }
			 }
		 }
	 }

	 System.out.println("Uppercase : "+upr );
	 System.out.println("Lowercase : "+lwr );
     System.out.println("Digits : "+dig );
	 System.out.println("Space : "+spc );
     System.out.println("Special Character : "+spl );
  }
}