/* Create a parent class called "Food" and create two child classes "Dessert" and "MainCourse". Each 
   child class should have its own unique method. */

  class Food {
   String type;
   String when;
   String include;
  }
  class Dessert extends Food{
    void desDetails(){
     type = "its always sweet";
     when = "have it after maincourse";
     include = "include different type sweets";
     System.out.println(type);
     System.out.println(when);
     System.out.println(include);
     System.out.println(" ");
     
    }
  }
   class MainCourse extends Food{
       void mainDetails(){
         type = "not sweet sometimes spicy";
         when = " have it after starter";
         include = "include different type cuisuins";
         System.out.println(type);
         System.out.println(when);
         System.out.println(include);
           
    }
  }
  class Program_24{
    public static void main(String [] args){
      Dessert  dobj = new Dessert ();
      dobj.desDetails();
      MainCourse mobj = new MainCourse();
      mobj.mainDetails();
    }
  }