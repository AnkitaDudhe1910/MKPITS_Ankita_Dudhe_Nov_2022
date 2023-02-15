class ExceptionDemo
{
   public static void main(String [] args)
   {
     int a = 2;
     int c = 0;

    System.out.println("Start Program");
    try{
      c = a/0;
     // c = a/2;  //there is no excetion so program will execute wihtout catching an exception
       }
    catch(ArithmeticException e)
       {
		    System.out.println("exception generated");
	   }
    System.out.println("end program  "+c);

   }
}