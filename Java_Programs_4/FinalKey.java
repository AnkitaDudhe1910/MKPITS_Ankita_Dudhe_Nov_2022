/* Program to demonstrate the use of the final keyword in java. */

 class Program{

  final String name ="Ankita";
  final String place = "Gadchiroli";



  final void display()
  {
	 /*
	 name ="ishita";  // error: cannot assign a value to final variable name
     place =" nagpur"; //error: cannot assign a value to final variable place
        */
    System.out.println("Name : "+name);
    System.out.println("Place : "+place);
  }

}
 class FinalKey extends Program{
/*@Override
 final void display()   // display() in FinalKey cannot override display() in Program final void display()
  {
    System.out.println("Name of person : "+name);
    System.out.println("Place of Person: "+place);
  }
*/
  public static void main(String [] args)
  {
     FinalKey obj = new FinalKey ();
     obj.display();
  }
}