/*
AAAAA
BBBB
CCC
DD
E

*/

class Pattern_17{
  public static void main(String [] args){
   for(char c='A';c<='E';c++)
    {
      for(char a='E';a>=c;a--){
        System.out.print(c+" ");
      }
       System.out.println(" ");
    }
  }
}