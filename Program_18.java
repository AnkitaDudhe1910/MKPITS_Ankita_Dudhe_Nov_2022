/*Write a java programming to calculate and prints the squares and cubes of the numbers
from 0 to 20 and usses tabs to display them in a table of values.*/

class assignment
{
	 void fun()
 {
	 for(int i=0;i<=20;i++)
	 {
		 int a = i*i;
		 int b = i*i*i;
		 System.out.println(i+"   "+a+"   "+b);
	 }
 }
}
class Program_18
{
  public static void main(String [] args)
  {
	  assignment ob = new assignment();
	  ob.fun();
  }
}