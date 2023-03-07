/* Program to demostrate inheritance in java. */

class Person {
  String name = "ankita";
  String place = "gadchiroli";
  String number = "9988774455";
}
class Employee extends Person {
  int empid = 17;
  float salary = 50000.00f;
  
  void display(){
  
   System.out.println("Name :"+name);
   
   System.out.println("Place :"+place);
   
   System.out.println("Mobile Number :"+number);
   
   System.out.println("Employee Id :"+empid);
   
   System.out.println("Salary :"+salary);  
  
  }
  public static void main(String [] args){
  
    Employee emp = new Employee();
    
    emp.display();
  }
}