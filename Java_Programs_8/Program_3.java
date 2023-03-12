/* Vehicle interface and car and motorcycle classes: Create an interface called Vehicle that has two abstract
   methods: start() and stop(). Then create two classes called Car and Motorcycle that implement the Vehicle interface.
   The Car class should have instance variables for the car's make and model, and the Motorcycle class should have an
   instance variable for the motorcycle's engine size.Implement the start() and stop() methods for each class. */

   interface Vehicle
   {
     void start();
     void stop();
   }
   class Car implements Vehicle
   {
     String cmake ="2008";
     String model = " Swift Dezire";
     @Override
     public void start()
     {
       System.out.println("car manufacture in "+cmake);
       System.out.println("car model "+model);
       System.out.println("car's engine starts with key");

     }
     public void stop()
     {
       System.out.println("car's engine stops with key");
       System.out.println(" ");
     }
   }
   class MotorCycle implements Vehicle
      {
        String engineSize ="small";

        @Override
        public void start()
        {
          System.out.println("engine size of motorcycle is "+engineSize);

          System.out.println("motorcycle's engine starts with key");

        }
        public void stop()
        {
          System.out.println("motorcycle's engine stops with key");

        }
   }
   class Program_3
   {
     public static void main(String [] args)
     {
       Car cobj = new Car();
       cobj.start();
       cobj.stop();

       MotorCycle mobj = new MotorCycle();
       mobj.start();
       mobj.stop();
     }
   }