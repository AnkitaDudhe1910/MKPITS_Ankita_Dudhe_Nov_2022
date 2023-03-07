/*
EEEEE
DDDD
CCC
BB
A

*/

class Pattern_19{
  public static void main(String [] args){
   for(char c='E';c>='A';c--)
    {
      for(char a='A';a<=c;a++){
        System.out.print(c+" ");
      }
       System.out.println(" ");
    }
  }
}