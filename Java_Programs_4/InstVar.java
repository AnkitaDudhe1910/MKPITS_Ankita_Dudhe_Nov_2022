/* Program to demonstrate the use of instance variable in Java. */

public class InstVar{

 public String name = "ankita";
 private String number = "99966665550";
 
 public void display(){
 
 System.out.println("Name : "+name);
 System.out.println("Mob Number : "+number);
 
 }
 public static void main(String [] args)
 {
   InstVar obj = new InstVar();
   obj.display();
 }
}