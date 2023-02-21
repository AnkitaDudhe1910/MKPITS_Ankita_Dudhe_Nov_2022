/* Write a java program to compute the perimeter and area of rectangle with height of 7 inches and width of 5 inches .*/

class Rectangle
{
  public static void main(String [] args)
  {
    int height = 7;
    int width = 5;
    int area, perimeter;

    area = height * width;

    perimeter = 2*(height + width);

    System.out.println("area of rectangle is : "+area+" inches");

    System.out.println("perimeter of rectangle is : "+perimeter+" inches");
  }
}