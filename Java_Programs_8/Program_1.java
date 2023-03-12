/* Shape interface and rectangle and circle classes:
   Create an interface called Shape that has two abstract methods: getArea() and getPerimeter().
   Then create two classes called Rectangle and Circle that implement the Shape interface.
   The Rectangle class should have instance variables for the length and width of the rectangle,
   and the Circle class should have an instance variable for the radius of the circle.
   Implement the getArea() and getPerimeter() methods for each class. */

   interface Shape
   {

    void getArea() ;

     void getPerimeter();

   }
  class Rectangle implements Shape
   {
	    int a = 6;
	    int b = 5;
   @Override
	  public  void getArea()
	    {
			float area = a*b;
			 System.out.println("area of rectangle : "+area);
		}
	public	void getPerimeter()
		{
			float perimeter = (2*a)+(2*b);
			System.out.println("perimeter of rectangle : "+perimeter);
		}
   }

   class Circle implements Shape
      {
   	    int r=3;
      @Override
   	  public  void getArea()
   	    {
   			double area = 3.14*r*r;
   			 System.out.println("area of circle : "+area);
   		}
   	public	void getPerimeter()
   		{
   			double perimeter = 2*3.14*r;
   			System.out.println("perimeter of circle : "+perimeter);
   		}
   }
   class Program_1
   {
     public static void main(String [] args)
     {

       Rectangle rect = new Rectangle();
       rect.getArea() ;
       rect.getPerimeter();

      Circle cir = new Circle();
	   cir.getArea() ;
       cir.getPerimeter();
     }
   }