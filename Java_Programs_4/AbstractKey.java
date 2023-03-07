/* Program to demonstrate the use of the abstract keyword in java. */

abstract class Program{

  abstract void display(String name, String place, String email);
  
}

class AbstractKey extends Program{
 @Override
 void display(String name, String place, String email){
   System.out.println("Name :"+name);
   System.out.println("Place :"+place);
   System.out.println("Email :"+email);
 }
 public static void main(String [] args)
 {
   AbstractKey obj = new AbstractKey();
   obj.display("ankita","gadchiroli","asfggg@gmail.com");
 }
}