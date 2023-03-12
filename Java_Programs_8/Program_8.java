/* GeometricShape interface and rectangle and circle classes:
   Create an interface called GeometricShape that has one abstract method: getArea(). Then create two classes
   called Rectangle and Circle that implement the GeometricShape interface. The Rectangle class should have
   instance variables for the length and width of the rectangle, and the Circle class should have an instance
   variable for the radius of the circle. Implement the getArea() method for each class. */


   interface GeometricShape
   {
   	  void getArea();
   }
   class Rectangle implements GeometricShape
   {
   	public int length=12, width=9;

   	public void getArea()
   	{
   	  double area = length * width;
   	  System.out.println("area of rectangle is "+ area);
   	  System.out.println(" ");
  	}

   }
   class Circle implements GeometricShape
   {
   	public int radius = 7;

   	public void getArea()
   	{
   	  double area = 3.14*radius*radius;
   	  System.out.println("area of circle is "+ area);

   	}

   }
class Program_8
{
 public static void main(String [] args)
 {
	 Rectangle rect = new Rectangle();
	 rect.getArea();
	 Circle cir = new Circle();
	 cir.getArea();
 }
}