/* Create a parent class called "Animal" and create two child classes "Fish" and "Reptile".
   Each child class should have its own unique method. */

    class Animal{

       String live;
       String move;
       int heart;
       String blood;
    }
    class Fish extends Animal{
       void fishDetails(){
         live = "water";
         move = "ventral fins";
         heart = 2;
        blood = "cold blooded";
        System.out.println("lives in "+live);
        System.out.println(" movement with "+move);
        System.out.println(" number of heart of chamberes"+heart);
        System.out.println("type of blood "+blood);
        System.out.println(" ");
       }
    }
    class Reptiles extends Animal{
       void reptDetails(){
          live = "land and water";
          move = "ventral fins";
          heart = 3;
          blood = "cold blooded";
          System.out.println("lives in "+live);
          System.out.println(" movement with "+move);
          System.out.println(" number of heart of chamberes"+heart);
          System.out.println("type of blood "+blood);
       }
    }

    class Program_10{

    public static void main(String [] args){
        Fish fobj = new Fish();
          fobj.fishDetails();
        Reptiles robj = new Reptiles();
         robj.reptDetails();
    }
    }