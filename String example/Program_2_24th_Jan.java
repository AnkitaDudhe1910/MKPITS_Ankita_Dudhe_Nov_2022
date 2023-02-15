class Program_2_24th_Jan
{
public static void main(String[]args)
{
String name1 = "ankita";
String name2  = "ishita";


System.out.println(name2.compareTo("ishita"));  // in compareTo() method  if output is 0 then its equal.


 // endsWith() method

	boolean a = name1.endsWith("a");
   System.out.println(a);

// startsWith() method

	boolean b = name1.endsWith("i");
    System.out.println(b);

//  indexOf() method

int p =name1.indexOf("t");
System.out.println(p);

// concat() method

String tr =name1.concat(name2);
System.out.println(tr);
}
}