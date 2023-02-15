                                                     /*   throw keyword   */
class Program_2
{
   public static void main(String [] args)
   {
      int bal=3000;
      int width = 5000;
      if(bal>width)
      {
      System.out.println("rupay le lo");
      }
      else
      {
      ArithmeticException ob = new ArithmeticException();
      throw ob;
      }
   }
}