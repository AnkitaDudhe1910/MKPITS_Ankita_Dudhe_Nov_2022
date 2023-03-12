/* Vehicle interface and bicycle and motorcycle classes:
   Create an interface called Vehicle that has two abstract methods: start() and stop(). Then create two classes called
   Bicycle and Motorcycle that implement the Vehicle interface. The Bicycle class should have an instance variable for
   the number of gears, and the Motorcycle class should have an instance variable for the engine displacement. Implement
   the start() and stop() methods for each class.
*/

interface Vehicle
{
	void start();
	void stop();
}
class Bicycle implements Vehicle
{
	String gear = "12";
	public void start()
	{
		System.out.println("number of gears are "+gear);
		System.out.println("starts when we start paddling");
	}
	public void stop()
	{
		System.out.println("Stops when we press break and stop paddling");
		System.out.println(" ");
	}
}
class MotorCycle implements Vehicle
{
	String engDisp = "100cc";
	public void start()
	{
		System.out.println("engine displacement in motorcycle is "+engDisp);
		System.out.println("starts engine with key on");
	}
	public void stop()
	{
		System.out.println("Stops the engine with off the key");
	}
}
class Program_12
{
  public static void main(String [] args)
  {
	  Bicycle bobj = new Bicycle();
	  bobj.start();
	  bobj.stop();

	  MotorCycle mobj = new MotorCycle();
	  mobj.start();
	  mobj.stop();
  }
}