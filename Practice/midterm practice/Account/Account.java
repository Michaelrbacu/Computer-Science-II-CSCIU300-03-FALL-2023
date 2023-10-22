
public class Account
{
private double balance;
private String name;
private long acctNum;

public static int numAccounts;

//----------------------------------------------
 //Constructor -- initializes balance and owner; generates random
 //account number
 //----------------------------------------------
 public Account(double initBal, String owner)
 {
 balance = initBal;
 name = owner;
 acctNum = (int) (Math.random() * Integer.MAX_VALUE);
 numAccounts++;
 }
//-------------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//-------------------------------------------------
public void withdraw(double amount)
{
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
}
//-------------------------------------------------
// Adds deposit amount to balance.
//-------------------------------------------------
public void deposit(double amount)
{
balance += amount;
}
//-------------------------------------------------
// Returns balance.
//-------------------------------------------------
public double getBalance()
{
return balance;
}

public void closeAccount() {
        balance = 0;         
        name = name + " CLOSED";
}

    
    
public static int getNumAccounts() {
   return numAccounts;
}
    
//-------------------------------------------------
// Returns a string containing the name, account number, and balance.
//-------------------------------------------------
public String toString()
{
return "Name:" + name +
"\nAccount Number: " + acctNum +
"\nBalance: " + balance;
}
}