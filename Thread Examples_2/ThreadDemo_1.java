                                      /*---Without synchronization (synchronized keyword)---*/
  class One
  {
	  void disp(String m)
	  {
		  System.out.print("["+m);
		  try
		  {
		  Thread.sleep(1000);
	      }
	      catch(InterruptedException e){ }
		  System.out.println("]");
	  }
  }
  class Two implements Runnable
  {
	  Thread t;
	  String s;
	  One dob;
	  Two(One dobref,String me)
	  {
		t = new Thread(this);
		s = me;
		dob = dobref;
		 t.start();
      }
      @Override
      public void run()
      {
		   dob.disp(s);
	  }

  }
  public class ThreadDemo_1
  {
    public static void main(String [] args)
    {
		One ob = new One();
		Two ob1 = new Two(ob,"hellow");
		Two ob2 = new Two(ob,"my");
		Two ob3 = new Two(ob,"problem");
    }
  }