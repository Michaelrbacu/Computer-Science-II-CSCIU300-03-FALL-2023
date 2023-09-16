//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account
{
private double balance;
private String name;
private long acctNum;
public double fee;
//-------------------------------------------------
//Constructor -- initializes balance, owner, and account number
//-------------------------------------------------
public Account(double initBal, String owner, long number)
{
balance = initBal;
name = owner;
acctNum = number;
}
//-------------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//-------------------------------------------------
public void withdraw(double amount)
{
//if the withdrawl amount is at equal to or more than 1001 dollars then a fee of 10 dollars will be applied to the account.
if(1001 <= amount){
   fee = 10;
   amount += fee;
   System.out.println("Withdraw amount is over 1000 a fee of "+ fee +" will be applied");

}

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
