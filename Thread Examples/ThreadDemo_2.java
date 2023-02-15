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
      catch(InterruptedException e){ }
      System.out.println(getName()+" "+i);
      if(i==3)
      {
         stop();
      }
    }
  }
}
public class ThreadDemo_2
{
  public static void main(String [] args)
  {
    Th1 ob1 = new Th1(); //creating multiple threading by using multiple object with same class
    Th1 ob2 = new Th1();
    Th1 ob3 = new Th1();
    
    ob1.start();
    ob2.start();
    ob3.start();
    
    System.out.println("waiting to die for "+ob2.getName()+" "+ob2.isAlive());
    try {
         ob2.join();
         Thread.sleep(1000);
         }
    catch(InterruptedException e){ }
    
    System.out.println("is dead "+ob2.getName()+" " +ob2.isAlive());
               
  }
}