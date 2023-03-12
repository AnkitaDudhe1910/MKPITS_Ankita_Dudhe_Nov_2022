/* BankAccount interface and checking and savings classes:
   Create an interface called BankAccount that has three abstract methods: getBalance(), deposit(), and withdraw().
   Then create two classes called CheckingAccount and SavingsAccount that implement the BankAccount interface. The
   CheckingAccount class should have an instance variable for the account's overdraft limit, and the SavingsAccount
   class should have an instance variable for the account's interest rate. Implement the getBalance(), deposit(), and
   withdraw() methods for each. */

interface BankAccount
{
	void getBalance();
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount
{
	public String limit = "5 lakh";
 public void getBalance()
  {
	  System.out.println("account's overdraft limit is"+limit);
	  System.out.println("balance is 9 lakh");
  }
 public void deposit()
  {
	  System.out.println("deposited amount is 50000/-");
  }
 public void withdraw()
  {
	   System.out.println("withdraw amout is 1 lakh");
	   System.out.println(" ");
  }
}
class SavingsAccount implements BankAccount
{
   public String intr = "12%";
 public void getBalance()
  {
	  System.out.println("for loan interest is"+intr);
	  System.out.println("balance amount is 12 lakh");
  }
 public void deposit()
  {
	   System.out.println("deposited amount is 2 lakh");
  }
  public void withdraw()
  {
	   System.out.println("withdraw amount is 5 lakh");
  }
}
class Program_10
{
  public static void main(String [] args)
  {
	    CheckingAccount cobj = new CheckingAccount();
	    cobj.getBalance();
        cobj.deposit();
	    cobj.withdraw();
	    SavingsAccount sobj = new SavingsAccount();
	    sobj.getBalance();
        sobj.deposit();
	    sobj.withdraw();
  }
}