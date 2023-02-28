// Fibonacci Series in Java.

class Fibonacci
{
  public static void main(String [] args)
  {
    int a=1,b=2,c;
    System.out.print(a+" "+b);
    for(int i=1;i<=10;i++)
    {
       c = a+b;
       System.out.print(" "+c);
       a=b;
       b=c;
    }
  }
}