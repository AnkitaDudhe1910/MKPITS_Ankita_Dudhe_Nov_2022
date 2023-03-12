/* Vehicle interface and car and truck classes:
   Create an interface called Vehicle that has two abstract methods: drive() and stop(). Then create two classes called
   Car and Truck that implement the Vehicle interface. The Car class should have instance variables for the car's make and
   model, and the Truck class should have instance variables for the truck's load capacity and towing capacity. Implement the
   drive() and stop() methods for each class. */

   interface Vehicle
   {
     void drive();
     void stop();
   }
   class Car implements Vehicle
   {
    public String cmake ="2008";
    public String model = " Swift Dezire";

     public void drive()
     {
       System.out.println("car manufacture in "+cmake);
       System.out.println("car model "+model);
       System.out.println("car shoul drive from left side of the road and should drive slowly");

     }
     public void stop()
     {
       System.out.println("car's engine stops with key");
       System.out.println(" ");
     }
   }
   class Truck implements Vehicle
      {
        public String loadCap = " 3 to 11 tones";
        public String towCap = " 5000 pounds";


        public void drive()
        {
          System.out.println("loading capacity of truck is "+loadCap);

          System.out.println("towing capacity of truck is "+towCap);
          System.out.println("car shoul drive from left side of the road and should drive slowly");
        }
        public void stop()
        {
          System.out.println("truck's engine stops with key");

        }
   }
   class Program_9
   {
     public static void main(String [] args)
     {
       Car cobj = new Car();
       cobj.drive();
       cobj.stop();

      Truck tobj = new Truck();
       tobj.drive();
       tobj.stop();
     }
   }