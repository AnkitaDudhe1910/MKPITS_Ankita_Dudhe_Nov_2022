class StringDemo
{
   public static void main(String [] args)
   {
     String s ="ankita";

     System.out.println(s);
    int d = s.length()/2;
    System.out.println(d);
     String s1 = s.substring(0,d);

     String s2 = s.substring(d);

     System.out.println(s1.toUpperCase());
     System.out.println(s2.toLowerCase());
      System.out.println(s1.toUpperCase()+s2.toLowerCase());
      System.out.println(s1.toUpperCase().concat(s2.toLowerCase()));
   }
}