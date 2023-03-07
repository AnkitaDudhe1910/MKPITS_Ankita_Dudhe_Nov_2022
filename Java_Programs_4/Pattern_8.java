/*
EEEEE
DDDDD
BBBBB
AAAAA

*/

class Pattern_8{
  public static void main(String [] args){
    for(char c='E'; c>='A';c--)
    {
      for(int j=1;j<=5;j++){
        System.out.print(c+" ");
      }
       System.out.println(" ");
    }
  }
}