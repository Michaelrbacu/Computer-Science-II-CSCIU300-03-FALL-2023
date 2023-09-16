//************************************************************
// TestAccount.java
//
// A simple driver to test the overloaded methods of
// the Account class.
//************************************************************

import java.util.Scanner;
import java.util.Random;

public class TestAccount {
    public static void main(String[] args) {
        String name;
        double balance;
        double fee;
        long acctNum;
        Account acct;
        double withdraw;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter account holder's first name");
        name = scan.next();


        //gets the balance randomly and then multiplies and divides it to get rid of all the extra decimals.
        balance = Math.round((1000.00 + Math.random() * 9000.00) * 100.0) / 100.0;

                
        // Generate a random account number
        acctNum = 1000 + rand.nextInt(9000);

        // Creates an Account object
        acct = new Account(balance, name, acctNum);

        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        System.out.print("\nDepositing 100 into account, balance is now ");
        acct.deposit(100);
        System.out.println(acct.getBalance());
        
        System.out.println("Enter withdraw amount, withdraws over $1000 will have a fee applied.");
        
        withdraw = scan.nextDouble();


        acct.withdraw(withdraw);
        System.out.print("\nWithdrawing " + withdraw + ", balance is now ");
        System.out.println(acct.getBalance());

        System.out.println("\nBye!");
    }
}
