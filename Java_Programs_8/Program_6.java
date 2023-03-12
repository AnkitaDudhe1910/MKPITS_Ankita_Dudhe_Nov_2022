/* Shape interface and circle and rectangle classes:
 Create an interface called Shape that has two abstract methods: getArea() and getPerimeter(). Then create two
 classes called Circle and Rectangle that implement the Shape interface. The Circle class should have an instance
 variable for the radius of the circle, and the Rectangle class should have instance variables for the width and
 height of the rectangle. Implement the getArea() and getPerimeter() methods for each class. */


interface Shape
{
	  void getArea();
	  void getPerimeter();
}
class Circle implements Shape
{
	public int radius = 3;

	public void getArea()
	{
	  double area = 3.14*radius*radius;
	   System.out.println("area of circle is "+ area);
	}
	public void getPerimeter()
	{
		double peri = 2*3.14*radius;
		 System.out.println("perimeter of circle is "+ peri);
		 System.out.println(" ");
	}

}
class Rectangle implements Shape
{
	public int width=4, height=8;

	public void getArea()
	{
	  double area = width * height;
	   System.out.println("area of rectangle is "+ area);
	}
    public void getPerimeter()
    {
		float peri = 2*(width + height);

    	 System.out.println("perimeter of rectangle "+ peri);
	}
}
class Program_6
{
  public static void main(String [] args)
  {
	  Circle cir = new Circle();
	  cir.getArea();
	  cir.getPerimeter();

	  Rectangle rect = new Rectangle();
	  rect.getArea();
	  rect.getPerimeter();
  }
}