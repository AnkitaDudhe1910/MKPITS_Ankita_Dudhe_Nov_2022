class ExceptionDemo_2
{
  public static void main(String [] args)
  {
     System.out.println("start program");
     int a = 2;
     int c = 0;
     
     int b[] = {1,2,3,4};
     try
        {
        c = a/0;
        for(int i=0;i<=b.length;i++)
        {
          System.out.println(b[i]);
        }
        }
     catch(ArrayIndexOutOfBoundsException e)
     {
       System.out.println("ArrayIndexOutOfBoundsException generated");
     }
     catch(ArithmeticException e)
     {
       System.out.println("ArithmeticException genrated");
     }
     finally
     {
      System.out.println("finally block executed");
     }
     System.out.println("end program"+c);
     System.out.println(b);
  }

}