/*
A
AB
ABC
ABCD

*/

class Pattern_13{
  public static void main(String [] args){
   for(char a='A';a<='D';a++)
    {
      for(char c='A';c<=a;c++){
        System.out.print(c+" ");
      }
       System.out.println(" ");
    }
  }
}