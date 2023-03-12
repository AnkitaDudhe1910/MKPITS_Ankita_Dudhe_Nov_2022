/* Musician interface and guitar and drums classes:
Create an interface called Musician that has two abstract methods: playInstrument() and sing().Then create two
classes called Guitarist and Drummer that implement the Musician interface. The Guitarist class should have an
instance variable for the guitar's brand, and the Drummer class should have an instance variable for the drum's size.
Implement the playInstrument() and sing() methods for each class. */


interface Musican
{
	void playInstrument();
	void sing();
}
class Guitarist implements  Musican
{
	public String gbrand = "Fender";
	public void playInstrument()
	{
		 System.out.println("Brand of guitar is "+gbrand);
		 System.out.println("Guitarist plays guitar");
	}
	public void sing()
	{
		System.out.println("most guitarist sings soothing songs");
		System.out.println(" ");
	}
}
class Drummer implements  Musican
{
	public String size = "medium";
	public void playInstrument()
	{
		 System.out.println("Size of drum is "+size);
		 System.out.println("Drummer  plays drum");
	}
	public void sing()
	{
		System.out.println("most drummer sings rock songs");
	}
}
class Program_5
{
  public static void main(String [] args)
  {
	    Guitarist gobj = new Guitarist();
	    gobj.playInstrument();
	    gobj.sing();

	    Drummer dobj = new Drummer();
	     dobj.playInstrument();
	     dobj.sing();
  }
}