class Program_24th_Jan
{
 public static void main(String[]args)
 {
	 // to covert string like a character by using charAt(int index)method.
   String name ="ankita";
   char ch;

   for(int i=0;i<6;i++)
   {
    ch = name.charAt(i);
    System.out.println(ch+" ");
   }
  //to conver charater array like a string by using String(char vaalue) constructor

  char str [] = {'a','n','s','h','u'};
  String st = new String(str);
  System.out.println(st);

  //to count the length of string

  int len = name.length();
  System.out.println(len);

 // to copy string one obj to another obj by directly in string class we don't need copy string method.
  String nst = new String();
  nst = st;
  System.out.println(nst);


 }
}