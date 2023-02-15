/* Write a C program to accept a coordinate point in a XY coordinate system and determine
   in which quadrant the coordinate point lies.*/

   import java.util.Scanner;

class Program_12_1
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("enter first co-ordinate");
     int x = sc.nextInt();

     System.out.println("enter second co-ordinate");
     int y = sc.nextInt();

     if(x >0 && y>0)
     {
        System.out.println(x +" & "+ +y+ " in the first quadrant");
     }
     else
     {
       if(x<0 && y>0)
       {
        System.out.println(x +" & "+ +y+ " in the second quadrant");
       }
       else
       {
         if(x<0 && y<0)
         {
          System.out.println(x +" & "+ +y+ " in the third quadrant");
         }
         else
         {
          if(x>0 && y<0)
          {
           System.out.println(x +" & "+ +y+ " in the fourth quadrant");
          }
          else
          {
           System.out.println(x +" & "+ +y+ " in the origin");
          }
         }
       }
     }
   }
}