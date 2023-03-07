/*  Create a class called "Employee" with two child classes "Manager" and "Developer".
    Each child class should have its own unique method. */

    class Employee{
       String name;
       int id;
       String role;
       String work;
       float salary;
    }
    class Manager extends Employee{
      void mangrDetails(){
           name = "Mr.Shah";
           id = 5;
           role ="Managening different team";
           work = "tracking expenses and making budget report";
           salary = 1.2f;

          System.out.println("Name : "+name);
          System.out.println("Emplyee Id : M"+id);
          System.out.println("Role of Manager : "+role);
          System.out.println("Work of Manager : "+work);
          System.out.println("Salary : "+salary+" lakh per month");
          System.out.println(" ");
      }

    }
    class Developer extends Employee{
         void devplrDetails(){
	      name = "Aman";
	        id = 10;
	      role ="develope Projects";
	      work = "ask for expenses ";
	    salary = 50.0f;

	     System.out.println("Name : "+name);
	     System.out.println("Developer Id : D"+id);
	     System.out.println("Role of Developer : "+role);
	     System.out.println("Work of Developer : "+work);
	     System.out.println("Salary : "+salary+" thousand per month");
      }

    }

    class Program_6{
    public static void main(String [] args){
        Manager mobj = new Manager();
        mobj.mangrDetails();
        Developer dobj = new Developer();
        dobj.devplrDetails();
    }
    }