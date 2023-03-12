/* Sports interface and basketball and football classes:
Create an interface called Sports that has two abstract methods: playGame() and getEquipment(). Then create
two classes called Basketball and Football that implement the Sports interface. The Basketball class should
have an instance variable for the ball's size, and the Football class should have an instance variable for the
football's shape. Implement the playGame() and getEquipment() methods for each class. */

interface Sports
{
	void playGame();
	void getEquipment();
}
class BasketBall implements Sports
{
	public String size = "29.5 inches";
	public void playGame()
	{
		System.out.println("size of basket ball is"+size);
		System.out.println("basket ball plays as dunck the ball in basket and it will count as basket");
	}
	public void getEquipment()
	{
	   System.out.println("get ball and basket. Basket should hanging at some height");
	   System.out.println(" ");
	}
}
class FootBall implements Sports
{
	public String shape = "round";
	public void playGame()
	{
		System.out.println("shape of foot ball is"+shape);
		System.out.println("foot ball plays with foot .Goal is count when after the striking ball it should go in net");

	}
	public void getEquipment()
	{
	   System.out.println("we need ball and big net");
	}
}
class Program_7
{
  public static void main(String [] args)
  {
	  BasketBall bobj = new BasketBall();
	  bobj.playGame();
	  bobj.getEquipment();

	  FootBall fobj = new FootBall();
	  fobj.playGame();
	  fobj.getEquipment();
  }
}