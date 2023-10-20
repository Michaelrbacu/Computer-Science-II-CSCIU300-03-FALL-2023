//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************
import java.util.Random;

public class Account
{
    private double balance;
    private String name;
    private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  //Constructor -- initializes balance and owner; generates random
  //account number
  //----------------------------------------------
  public Account(double initBal, String owner)
  {
    balance = initBal;
    name = owner;
    acctNum = (int) (Math.random() * (9999-1000+1)) + 1000;
  }

/*Hint about generating random numbers.
The Math.random() function returns a floating-point, pseudo-random number in the range 0 to less than 1 (inclusive of 0, but not 1)
Random rand = new Random();
rand.nextInt(10)+10; this generate [0,19]; // this generate a number in the range  [0,19] 
//nextInt(n) generates an int number in [0,n-1]
If you wants to generate an integer in range [low, high], have the Random object calls nextInt() such as rand.nextInt(high – low  + 1)  + low;
*/

  //----------------------------------------------
  //Constructor -- initializes owner as given and balance to 0.  
  //Generates random account number
  //----------------------------------------------
  public Account(String owner)
  {
    balance = 0;
    name = owner;
    Random gen = new Random();
    acctNum = (int) (gen.nextInt(9999-1000+1) +1000);
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // Also deducts fee from account.
  //----------------------------------------------
  public void withdraw(double amount, double fee)
  {
    if (amount>1000 && balance >= (amount + fee))
	balance -= amount+fee;
    else if (balance >= amount&& amount<=1000)
	balance -= amount;
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Returns a string containing the name, acct number, and balance.
  //----------------------------------------------
    public String toString()
    {
	return "Name: " + name + 
	    "\nAcct #: " + acctNum + 
	    "\nBalance: " + balance;
    }
}
