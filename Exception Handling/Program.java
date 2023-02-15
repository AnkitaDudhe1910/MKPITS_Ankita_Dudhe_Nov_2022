class Program
{
  public static void main(String [] args)
  {
     int a = 2;
     Integer ob = new Integer(a); //primitive int into Integer using Constructor.
     System.out.println(ob);
     
     Integer ob1 = Integer.valueOf(a); //primitive int to Integer object using method.
     System.out.println(ob1);
     
     int x = ob.intValue(); // integer object to primitive data type.
     System.out.println(x);
     
     /*------------------------------------------------------------------------------------------------------------------*/
     
     String iob = ob.toString(); //Integer object  to string.
     System.out.println(iob);
     
     String iob2 = Integer.toString(); //primitive int to string
     System.out.println(iob2);
     
     int y = Integer.parseInt(iob); //string object to primitive int
     System.out.println(y);
     
     Integer z = Integer.valueOf(iob); // String object to integer object
     System.out.println(z);
  }
}