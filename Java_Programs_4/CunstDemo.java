/* Program to demonstarate the use of constructor in java. */

public class CunstDemo{
   String name;
   String surename;
   
  public CunstDemo(String name, String surename){
      this.name = name;
      this.surename = surename;
  }
  public void display(){
  System.out.println("Name : "+name);
  System.out.println("Surename : "+surename);
  }
 public static void main(String[]args)
 {
   CunstDemo obj = new CunstDemo("Shital","Dongre");
   obj.display();
 }
}