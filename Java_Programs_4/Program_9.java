/*  Create a class called "Vehicle" with two child classes "Car" and "Truck". Each
    child class should have its own unique method.*/

    class Vehical{

     String company;
     String purpose;
     int tyres;
     float avg;
    }
    class Car extends Vehical{
      void carDetails(){
         company = "Audi";
         purpose = "for travelling";
         tyres = 4;
         avg = 17.8f;
         System.out.println("Company name :"+company);
         System.out.println("Purpose : "+purpose);
         System.out.println("number of tyres : "+tyres);
         System.out.println("Average per km : "+avg+"kmpl");
         System.out.println(" ");
      }
    }
    class Truck extends Vehical{
       void truckDetails(){
          company = "Mahindra";
          purpose = "for pick up load";
          tyres = 8;
          avg = 3.5f;
          System.out.println("Company name :"+company);
          System.out.println("Purpose : "+purpose);
          System.out.println("number of tyres : "+tyres);
          System.out.println("Average per km : "+avg+"kmpl");
      }
    }

    class Program_9{

    public static void main(String [] args){
      Car cobj = new Car();
      cobj.carDetails();
      Truck tr = new Truck();
      tr.truckDetails();

    }
    }