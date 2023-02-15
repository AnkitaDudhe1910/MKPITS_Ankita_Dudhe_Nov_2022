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
			 System.out.println(getName()+" : "+i); //for getting the name of thread.
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
			 System.out.println(getName()+" : "+i); //for getting the name of thread.
		 }
	 }
}
public class ThreadDemo_1
{
  public static void main(String []args)
  {
	   Th1 ob1 = new Th1();
	   ob1.setName("ram");  //for changing the name of thread.
	   Th2 ob2 = new Th2();
	   ob2.setName("shyam"); //for changing the name of thread.

	//   System.out.println(ob1); //for displaying the information of thread
	//   System.out.println(ob2); //for displaying the information of thread

	     Thread mth = Thread.currentThread(); //for getting the info of main method/thread
	     System.out.println(mth);

	   ob1.start();
	   ob2.start();
  }
}