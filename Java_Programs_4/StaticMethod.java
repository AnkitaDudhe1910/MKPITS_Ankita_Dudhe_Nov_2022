/* Program to demonstrate the use of static method in java. */

class StaticMethod{

 static String name = "Ankita";
 static String place = "Gadchiroli";

public static void display(){

System.out.println("Name : " + name);
System.out.println("Place : " + place);

}
 public static void main(String [] args){
   StaticMethod.display();
 }
}