/* Shape interface and square and triangle classes:
Create an interface called Shape that has two abstract methods: getArea() and getPerimeter(). Then create two classes
called Square and Triangle that implement the Shape interface. The Square class should have an instance variable for
the side length of the square, and the Triangle class should have instance variables for the base and height of the
triangle. Implement the getArea() and getPerimeter() methods for each class. */


interface Shape
{
	  void getArea();
	  void getPerimeter();
}
class Square implements Shape
{
	public int a=4;

	public void getArea()
	{
	  int area = a*a;
	   System.out.println("area of square "+ area);
	}
	public void getPerimeter()
	{
		 System.out.println("perimeter of square "+ a);
		 System.out.println(" ");
	}

}
class Triangle implements Shape
{
	public int breadth=4, length=8, heigth=5;

	public void getArea()
	{
	  double area = 0.5* length*breadth;
	   System.out.println("area of triangle "+ area);
	}
    public void getPerimeter()
    {
		float peri = breadth + length + heigth;

    	 System.out.println("perimeter of triangle "+ peri);
	}
}
class Program_4
{
  public static void main(String [] args)
  {
	  Square sqr = new Square();
	  sqr.getArea();
	  sqr.getPerimeter();

	  Triangle tri = new Triangle();
	  tri.getArea();
	  tri.getPerimeter();
  }
}