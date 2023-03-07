/* Program to demonstrate compile time polymorphism in java.*/

class CompilePoly
{

 public void display(String name, String place, String email){ 
 
 System.out.println("Name : "+name);
 
 System.out.println("Palce : "+place);
 
 System.out.println("Email : "+email);
 
 }
 public void display(String name, String place){ 
 
 System.out.println("Name : "+name);
 
 System.out.println("Palce : "+place);

 }
 
 public static void main(String [] args)
 {
   CompilePoly obj = new CompilePoly();
   obj.display("Ankita","Gadchiroli","adbbsd@gmail.com");
   obj.display("Ishita","Nagpur");
 }
}