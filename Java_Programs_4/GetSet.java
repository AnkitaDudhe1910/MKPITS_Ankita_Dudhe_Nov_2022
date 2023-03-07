/* Program to demonstrate the use of getter and setter methods in java. */

public class GetSet{
   String name;
   String surename;

   public String getName(){
    return this.name;
   }
    public void setName(String name){
       this.name = name;
   }
   public String getSureName(){
       return this.surename;
      }
       public void setSureName(String surename){
          this.surename = surename;
   }

   public static void main(String [] args)
   {
     GetSet obj = new GetSet();
     obj.setName("Shital");
     obj.setSureName("Dongare");
     System.out.println("Name : "+ obj.getName());
     System.out.println("Surename : "+ obj.getSureName());
   }
}
