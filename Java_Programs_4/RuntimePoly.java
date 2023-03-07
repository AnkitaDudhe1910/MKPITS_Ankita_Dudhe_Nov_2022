/* Program to demonstrate runtime polymorphism. */

class Program{

 void display(String name, String place){

   System.out.println("Name : "+name);

   System.out.println("Place : "+place);
  }
}
class Program_1 extends Program
{
	@Override

	void display(String name, String place){

	    System.out.println("Person name is : "+name);

	    System.out.println("Person place : "+place);
  }
}
 class RuntimePoly extends Program_1{

 public static void main(String [] args){

     RuntimePoly obj = new RuntimePoly();
     obj.display("Ankita","Gadchiroli");


 }
}