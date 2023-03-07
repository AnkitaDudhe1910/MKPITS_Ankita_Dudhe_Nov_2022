/* Write a C program to read a password until it is correct. For wrong password print "Incorrect password"
   and for correct password print "Correct password" and quit the program. The correct password is 1234. */

   import java.util.Scanner;

   class Password{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter password");
     String pass = sc.next();
     int n=1;
     while(n !=0)
     if(pass.equals("1234")){
       System.out.println("correct password");
       n = 0;
     }
     else
     {
      System.out.println("incorrect password");
      System.out.println("enter password");
      pass = sc.next();
       n++;
     }
   }
   }