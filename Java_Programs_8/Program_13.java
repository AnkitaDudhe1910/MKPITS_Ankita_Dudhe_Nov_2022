/* Shape interface and ellipse and rhombus classes:
   Create an interface called Shape that has two abstract methods: getArea() and getPerimeter(). Then create two classes
   called Ellipse and Rhombus that implement the Shape interface. The Ellipse class should have instance variables for the
   major and minor axes, and the Rhombus class should have instance variables for the diagonals. Implement the getArea() and
   getPerimeter() methods for each class. */

interface Shape
{
	 void getArea();
	 void getPerimeter();
}
class Ellipse implements Shape
{
	  float major = 12.6f;
	  float minor = 6.3f;
	public void getArea()
	 {
		 double area = 3.14*major*minor;
		 System.out.println("area of ellipse is "+area);
     }
	public void getPerimeter()
	 {
		 double peri = 3.14*(major + minor);
		 System.out.println("perimeter of ellipse is "+peri);
		 System.out.println(" ");
	 }
}
class Rhombus implements Shape
{
	  float d1 = 11.6f;
	  float d2 = 8.3f;
	public void getArea()
	 {
		 double area = (d1+d2)/2;
		 System.out.println("area of rhombus is "+area);
     }
	public void getPerimeter()
	 {
		 double peri = 4*d1;
		 System.out.println("perimeter of rhombus is "+peri);
	 }
}
class Program_13
{
  public static void main(String [] args)
  {
       Ellipse ep = new Ellipse();
       ep.getArea();
       ep.getPerimeter();
       Rhombus rh = new Rhombus();
       rh.getArea();
       rh.getPerimeter();
  }
}