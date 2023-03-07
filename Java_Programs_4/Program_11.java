/* Create a parent class called "Food" and create two child classes "Fruit"
   and "Vegetable". Each child class should have its own unique method. */

    class Food{

      String typeOfPlant;
      String consumption;
      String sugar;
      String typeOfEat;
    }
    class Fruit extends Food{
      void frtDetails(){

      typeOfPlant= "woody";
      consumption ="raw";
      sugar = "high";
      typeOfEat = "dessert";

      System.out.println("type of plan is "+typeOfPlant);
      System.out.println("type of consumption is "+consumption);
      System.out.println("sugar is "+sugar);
      System.out.println("type of eat as "+typeOfEat);
      System.out.println(" ");
      }
    }
    class Vegetable extends Food{
       void vegDetails(){

         typeOfPlant= "hebaceous";
         consumption ="cooked";
         sugar = "low";
         typeOfEat = "meal";

         System.out.println("type of plan is "+typeOfPlant);
         System.out.println("type of consumption is "+consumption);
         System.out.println("sugar is "+sugar);
         System.out.println("type of eat as "+typeOfEat);
      }
    }

    class Program_11{
    public static void main(String [] args){
      Fruit  fobj = new Fruit ();
      fobj.frtDetails();
      Vegetable vobj = new Vegetable();
      vobj.vegDetails();
    }
    }