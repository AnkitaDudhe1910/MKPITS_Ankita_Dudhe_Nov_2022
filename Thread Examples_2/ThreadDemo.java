                                    /*---CREATING THREAD BY USING INTERFACE---*/

class Thre implements Runnable
{
	 Thread t ;
	 Thre()
	 {
		t = new Thread(this);
		t.start();
	 }

	 @Override
	 public void run()
	 {
		  for(int i=0;i<=10;i++)
		  {
			 System.out.println(t.getName()+" "+i);
		  }
	 }
}
public class ThreadDemo
{
   public static void main(String [] args)
   {
	     Thre ob1 = new Thre();

	     Thre ob2 = new Thre();
   }

}