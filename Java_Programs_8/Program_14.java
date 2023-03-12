/*  Color interface and red, green, and blue classes:
    Create an interface called Color that has one abstract method: getColorCode(). Then create three classes called Red,
    Green, and Blue that implement the Color interface. Each class should have an instance variable for its corresponding
    color code (e.g., "FF0000" for red). Implement the getColorCode() method for each class. */

interface Color
{
	void getColorCode();
}
class Red implements Color
{
	public String colorCode = "ff0000";
	public void getColorCode()
	{
		System.out.println("color code of red is "+colorCode);
	}
}
class Green implements Color
{
	public String colorCode = "00b42c";
	public void getColorCode()
	{
		System.out.println("color code of green is "+colorCode);
	}
}
class Blue implements Color
{
	public String colorCode = "0050a3";
	public void getColorCode()
	{
		System.out.println("color code of blue is "+colorCode);
	}
}
class Program_14
{
  public static void main(String [] args)
  {
	  Red r = new Red();
	  r.getColorCode();
	  Green g = new Green();
	  g.getColorCode();
	  Blue b = new Blue();
	  b.getColorCode();
  }
}