/* Accept 3 floating point values and if it is possible to make triangle with them also
   calculate the parameter of triangle said values are valid.*/

import java.util.Scanner;

class Triangle
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter three integer");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();

    float sum1 = a+b;
    float sum2 = a+c;
    float sum3 = b+c;

    if(sum1>c&&sum2>b&&sum3>a)
    {
      System.out.println("Yes, it is possible to make triangle with given numbers");

      float para = a+b+c;
      System.out.println("Parameter of triangle is : "+para);
    }
    else
    {
		System.out.println("No, it is not possible to make triangle with given numbers");
	}
  }
}