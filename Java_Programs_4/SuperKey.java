/* Program to demonstrate the use of the super keyword in construcor in java. */

 class Program{

String name;
String place;

public Program(String name,String place){

this.name = name;
this.place = place;

}
void display(){
System.out.println("Name : "+name);
System.out.println("Place : "+place);
}
}
class SuperKey extends Program{

public SuperKey(String name,String place){

  super(name,place);

}
@Override
void display(){
System.out.println("Name of class: "+name);
System.out.println("Place of class: "+place);
}
public static void main(String [] args){

SuperKey obj = new SuperKey("MKPITS","Nagpur");
obj.display();
}
}