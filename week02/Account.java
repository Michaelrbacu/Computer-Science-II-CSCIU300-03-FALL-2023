//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
/*
File Account.java (see previous exercise) contains a definition for a simple bank account class with methods to
withdraw, deposit, get the balance and account number, and return a String representation. Save this class to your
directory and study it to see how it works. Then write the following additional code:

1. Suppose the bank wants to keep track of how many accounts exist.

a. Declare a private static integer variable numAccounts to hold this value. Like all instance and static
variables, it will be initialized (to 0, since it’s an int) automatically.

b. Add code to the constructor to increment this variable every time an account is created.
c. Add a static method getNumAccounts that returns the total number of accounts. Think about why this
method should be static - its information is not related to any particular account.

d. File TestAccounts1.java contains a simple program that creates the specified number of bank accounts
then uses the getNumAccounts method to find how many accounts were created. Save it to your
directory, then use it to test your modified Account class.

2. Add a method void close() to your Account class. This method should close the current account by
appending “CLOSED” to the account name and setting the balance to 0. (The account number should remain
unchanged.) Also decrement the total number of accounts.

3. Write a test program TestAccounts2 that prompts for and reads in three names and creates an account
with an initial balance of $100 for each. Print the three accounts, then close the first account. Call
numAccounts()to print the number of accounts.
*/
//************************************************************

public class Account
{
private double balance;
private String name;
private long acctNum;

public static int numAccounts;

private boolean isOpen = true;

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
        name = "Closed";
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