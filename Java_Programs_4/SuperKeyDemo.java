/* Program to demonstrate the use of the super keyword in method in java. */

class Program{

public void display(){

  System.out.println("This is MKPITS");
}

}

class SuperKeyDemo extends Program {
 @Override
 public void display(){
 
 super.display();
 
 System.out.println("This is Training Program");
 
 }
 public static void main(String [] args){
   
   SuperKeyDemo obj = new SuperKeyDemo();
   obj.display();
 }
}