/* Write a program accepts 4 integer PQRS from user where R and S are positive integer and P is even
   if Q is greater than P and if(R+S) is greater (P+Q) print correct value otherwise print wrong value.*/

import java.util.Scanner;

class Program
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of P,Q,R,S");
    System.out.println("P :" );
    int P = sc.nextInt();
    System.out.println("Q :" );
    int Q = sc.nextInt();
    System.out.println("R :" );
    int R = sc.nextInt();
    System.out.println("S :" );
    int S = sc.nextInt();
    int  sum1 = R+S;
    int  sum2 = P+Q;
    if(R>0 && S>0 && P%2==0 && Q>R && S>P && sum1>sum2)
    {
       System.out.println("Correct Value");
    }
    else
    {
      System.out.println("Wrong Value");
    }
  }
}