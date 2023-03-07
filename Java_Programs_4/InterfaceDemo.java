/* Program to demonstrate the use of interface in java. */

interface Program{

  void display(String name, String place);
}
public class InterfaceDemo implements Program
{
  @Override
 public void display(String name, String place){

  System.out.println("Name : "+ name);

  System.out.println("Place : "+ place);

  }
  public static void main(String [] args)
  {
    InterfaceDemo obj = new InterfaceDemo();

    obj.display("Sanchita","Dudhe");
  }
}