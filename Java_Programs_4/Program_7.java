/*  Create a parent class called "Food" and create three child classe
    "Pizza" and "Burger" that inherit from it. Each child class
     should have its own unique method.
*/

    class Food{
       String type;
       String place;
    }
    class Pizza extends Food{
      void pzDetails(){
       type = " cheez pizza";
       place = "dominoz";
       System.out.println("Type of Pizza : "+type);
       System.out.println("Place of Pizza : "+place);
       System.out.println(" ");
     }

    }
    class Burger extends Food{
       void burDetails(){
       type = " chicken burger";
       place = "Burger King";
       System.out.println("Type of Burger : "+type);
       System.out.println("Place of Burger : "+place);
     }

    }

    class Program_7{
    public static void main(String [] args){
       Pizza pz = new Pizza();
       pz.pzDetails();
       Burger br = new Burger();
       br.burDetails();
    }
    }