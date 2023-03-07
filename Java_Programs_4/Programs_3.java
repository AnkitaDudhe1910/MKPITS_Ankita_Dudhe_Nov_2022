/* Create a class called "Shape" that has a method to calculate its area. Create three child classes
  "Rectangle", "Triangle", and "Circle" that inherit from the Shape class and override the area method. */

import java.util.Scanner;

 class Shape
{
 double area;
  Scanner sc = new Scanner(System.in);
  void areaOfShape(){

  }
}

 class Rectangle extends Shape
  {
  @Override
  void areaOfShape(){
   System.out.println("enter length and breadth of rectangle");
   int l = sc.nextInt();
   int b = sc.nextInt();
   area = l*b;
   System.out.println("area of rectangle is: "+area);
  }

}
 class Triangle extends Shape
{
 @Override
  void areaOfShape(){
   System.out.println("enter length,breadth and height of triangle");
   int l = sc.nextInt();
   int b = sc.nextInt();
   int h = sc.nextInt();
   area = l*b*h;
   System.out.println("area of triangle is: "+area);
  }

}
 class Circle extends Shape
{
 @Override
   void areaOfShape(){
     System.out.println("enter radius of circle");
     int r = sc.nextInt();
     area = 3.14*r*r;
     System.out.println("area of circle is: "+area);
  }

}
class Programs_3 {

  public static void main(String [] args){

   Rectangle rect = new Rectangle();
   rect.areaOfShape();
   Triangle tria = new Triangle();
   tria.areaOfShape();
   Circle cir = new Circle();
   cir.areaOfShape();
  }
}