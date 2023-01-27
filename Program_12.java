// Write a java program to print the alphabet set in decimal and character form.

class assignment
{
	char ch;
	void set ()
	{

		for(ch='A'; ch<='Z';ch++)
		{
			int a = (int)ch ;
	     	 System.out.println(ch+"="+a);
		}
	}
}
class Program_12
{
 public static void main(String[] args)
 {
   assignment ob = new assignment();
   ob.set();
 }
}