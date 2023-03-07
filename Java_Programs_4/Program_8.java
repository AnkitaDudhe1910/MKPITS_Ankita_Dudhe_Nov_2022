/*  Create a parent class called "Shape" and create two child classes "Rectangle" and "Square"
    that inherit from it.Override the area method in the Square class.*/


    class Shape{

      float area;

      void area(){

      }
    }
    class Rectangle extends Shape{
       @Override
       void area(){
          int a=6, b=9;
          area = a*b;
          System.out.println("area of rectangle : "+area);
          System.out.println(" ");
      }
    }
    class Square extends Shape{
       @Override
        void area(){
           int a=6;
           area = a*a;
           System.out.println("area of square : "+area);
      }
    }

    class Program_8{

    public static void main(String [] args){
      Rectangle rct = new Rectangle();
      rct.area();
      Square sqr = new Square();
      sqr.area();
    }
    }