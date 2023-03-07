/*  Create a parent class called "Building" and create two child classes "House" and "Apartment"
    that inherit from it. Each child class should have its own unique method. */

    class Building{

      String type;
      float  area;
      float price;

    }
    class House extends Building{

     void houseDetails(String type, float  area,float price){

     System.out.println("type of House is "+type+" flat");
     System.out.println("area of House is "+area+" sq.ft");
     System.out.println("price of House is "+price +" lakh");
     System.out.println(" ");
     }
    }
    class Apartment extends Building{
     void aptDetails(String type, float  area,float price){

         System.out.println("type of Apartment is "+type+" apartment");
         System.out.println("area of Apartment is "+area +" sq.ft");
         System.out.println("price of Apartment is "+price +" lakh");

     }
    }

    class Program_5{
    public static void main(String [] args){

    House hobj = new House();
    hobj.houseDetails("2bhk",550.0f,50);
    Apartment aobj = new Apartment();
    aobj.aptDetails("studio",300.0f,10);
    }
    }