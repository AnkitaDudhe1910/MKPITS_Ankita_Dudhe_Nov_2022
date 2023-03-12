/*Animal interface and dog and cat classes:
Create an interface called Animal that has two abstract methods:
makeSound() and move(). Then create two classes called Dog and
Cat that implement the Animal interface. The Dog class should
have an instance variable for the dog's breed, and the Cat
class should have an instance variable for the cat's name.
Implement the makeSound() and move() methods for each class. */

interface Animal
{
   void makeSound();
   void move();
}

class Dog implements Animal
{
   String breed = "Labrador";
 @Override
 public void makeSound()
 {
   System.out.println("breed of dog is "+breed);
    System.out.println("dog make sound of barking");
 }
 public void move()
 {
   System.out.println("dogs runs very fast towards their owner");
   System.out.println(" ");
 }

}
class Cat implements Animal
{
   String cname = "meow meow";
 @Override
 public void makeSound()
 {
   System.out.println("name of cat is "+cname);
    System.out.println("cat make sound of meowing");
 }
 public void move()
 {
   System.out.println("cats move slowly and curiously towards things");
 }
}
class Program_2
{
  public static void main(String [] args)
  {
    Dog dobj = new Dog();
    dobj.makeSound();
    dobj.move();

   Cat cobj = new Cat();
    cobj.makeSound();
    cobj.move();
  }
}