
class Pattern_20{
 public static void main(String [] arg){

  for(char a='A'; a<='E'; a++)
  {
    for(char c='E'; c>=a; c--)
    {
      System.out.print(c+"");
    }
    System.out.println(" ");
  }
 }
}