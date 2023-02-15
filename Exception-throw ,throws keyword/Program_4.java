import java.util.Scanner;
class EvenException extends Exception
{
   EvenException (String s)
   {
      super(s);
   }

}
class OddException extends Exception
{
   OddException (String s1)
      {
         super(s1);
      }

}
class Program_4
{
  public static void main(String[] args) throws Exception
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number");
    int a=sc.nextInt();

    if(a%2==0)
    {
      EvenException ob1 = new EvenException( "even number");
      throw ob1;
    }
    else
    {
      OddException ob2 = new OddException("Odd number");
      throw ob2;
    }
  }

}