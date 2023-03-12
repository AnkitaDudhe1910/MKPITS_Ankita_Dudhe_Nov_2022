/* Animal interface and cat and dog classes:
   Create an interface called Animal that has two abstract methods: makeSound() and move(). Then create two classes
   called Cat and Dog that implement the Animal interface. The Cat class should have an instance variable for the cat's
   breed, and the Dog class should have an instance variable for the dog's weight. Implement the makeSound() and move()
   methods for each class. */

interface Animal
{
	void makeSound();
	void move();
}
class Cat implements Animal
{
	public String breed = "Persian";
	public void makeSound()
	{
      System.out.println("Breed of cat is "+breed);
      System.out.println("Cat makes meowing sound");
	}
	public void move()
	{
		 System.out.println("Cat moves slowly and curiously towards object");
		  System.out.println(" ");
	}
}
class Dog implements Animal
{
	public String weigth = "25 kg";
	public void makeSound()
	{
      System.out.println("dog weigth is : "+weigth);
      System.out.println("dog makes barking sound");
	}
	public void move()
	{
		 System.out.println("dog moves fast towards object and their owner");

	}
}
class Program_11
{
  public static void main(String [] args)
  {
	  Cat cobj = new Cat();
	  cobj.makeSound();
	  cobj.move();

	  Dog dobj = new Dog();
	  dobj.makeSound();
	  dobj.move();
  }
}