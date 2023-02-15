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
    }
  }
}

public class ThreadDemo_3
{
  public static void main(String [] args)
  {
    Th1 ob1 = new Th1();
    ob1.setName("ram");
    Th1 ob2 = new Th1();
    ob2.setName("shyam");
    Th1 ob3 = new Th1();
    ob3.setName("ghanshyam");
    
    ob1.start();
    ob2.start();
    ob3.start();
    
    try {
       System.out.println(ob2.getName()+"is suspending ");
       Thread.sleep(1000);
       ob2.suspend();
       Thread.sleep(1000);
       ob2.resume();
       System.out.println(ob2.getName()+"is resumed ");
      }
      catch (Exception e) { }
      
      System.out.println("is dead "+ob2.getName()+" " + ob2.isAlive());
  }
}