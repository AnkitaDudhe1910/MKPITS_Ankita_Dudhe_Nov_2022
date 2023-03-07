/*  Create a parent class called "Vehicle" and create two child classes "Car" and "Motorcycle" that inherit from it.
    Give each child class its own unique method.*/

import java.util.Scanner;

class Vehicals
{
    String vehicalName ;
    String vehicalColor ;
}

class Car extends Vehicals
{

  void carDisplay(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the name of car");
	      vehicalName = sc.next();
	    System.out.println("enter the color of car");
	      vehicalColor = sc.next();
    System.out.println(" the name of car is :"+vehicalName);
    System.out.println(" the color of car is : "+vehicalColor);
  }
}
class MotorCycle extends Vehicals
{

  void motorDisplay(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the name of motorcycle");
	      vehicalName = sc.next();
	    System.out.println("enter the color of motorcycle");
	      vehicalColor = sc.next();
    System.out.println("  name of motorcycle :"+vehicalName);
    System.out.println("  color of motorcycle : "+vehicalColor);
  }
}
class Programs_1{
  public static void main(String [] args){
       Car cobj = new Car();
       cobj.carDisplay();
       MotorCycle mobj = new MotorCycle();
       mobj.motorDisplay();
  }
}