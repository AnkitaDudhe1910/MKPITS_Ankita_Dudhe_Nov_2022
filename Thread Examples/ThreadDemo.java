class Th1 extends Thread
{
  @Override
   public void run()
   {
     for(int i=0;i<=10;i++)
     {
        try
	      {
	        sleep(1000);
	      }
	   catch(InterruptedException e)
		  {

	      }

	       System.out.println(i);
     }
   }

}
class Th2 extends Thread
{
  @Override
   public void run()
   {
     for(int i=10;i>=0;i--)
     {
	    System.out.println(i);
     }
   }

}
public class ThreadDemo
{
  public static void main(String [] args)
  {
     Th1 ob1 = new Th1();
     Th2 ob2 = new Th2();
     ob1.start(); //for starting the program
     ob2.start();
  }
}