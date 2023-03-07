/* Write a C program to calculate the value of S where S = 1 + 1/2 + 1/3 + … + 1/50. */

 class Calculate {
   public static void main(String [] args){
   float s =1.0f;
   for(int i=2;i<=20;i++)
   {
     s =(s+1/i);
   }
   System.out.println(s);
   }
 }