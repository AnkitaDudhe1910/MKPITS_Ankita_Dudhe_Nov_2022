/* Create a parent class called "Animal" and create three child classes "Lion", "Tiger",
   and "Bear". Each child class should have its own unique method.
*/
    class Animal{

      int weight;
      float length;
      int fight;
      String range;

    }
    class Lion extends Animal{

      void lionDetails(){

        weight = 550;
        length = 6.8f;
        fight = 4;
        range = "Africa,Europe,Asia";

        System.out.println("Weight of lion is : "+weight+" pounds");
        System.out.println("length of lion is : "+length+"ft");
        System.out.println("lion fights with "+fight);
        System.out.println("lion found in region "+range);
        System.out.println(" ");
      }
    }
    class Tiger extends Animal{
       void tigerDetails(){

          weight = 660;
          length = 12.8f;
          fight = 4;
          range = "Asia";

          System.out.println("Weight of tiger is : "+weight+" pounds");
          System.out.println("length of tiger is : "+length+"ft");
          System.out.println("tiger fights with "+fight);
          System.out.println("tiger found in region "+range);
          System.out.println(" ");
      }

    }
    class Bear extends Animal{
        void bearDetails(){

          weight = 900;
          length = 9;
          fight = 2;
          range = "Russia,Himalaya,Finland";

          System.out.println("Weight of bear is : "+weight+" pounds");
          System.out.println("length of bear is : "+length+"ft");
          System.out.println("bear fights with "+fight);
          System.out.println("bear found in region "+range);

      }

    }
    class Program_12{
    public static void main(String [] args){

     Lion lobj = new Lion();
     lobj.lionDetails();
     Tiger tobj = new Tiger();
     tobj.tigerDetails();
     Bear bobj = new Bear();
     bobj.bearDetails();
    }
    }