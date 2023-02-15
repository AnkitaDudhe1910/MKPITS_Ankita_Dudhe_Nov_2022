class ExceptionDemo_finally
{
   public static void main(String [] args)
   {
    System.out.println("Start Program");
     int a = 2;
     int c = 0;


    try{
      c = a/0;

       }
    catch(ArithmeticException e)
       {
		    System.out.println("exception generated");
	   }
    finally
	   {
	           System.out.println("finally block execute");
	   }
    System.out.println("end program  "+c);

   }
}