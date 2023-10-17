package Assignments.Project;

import java.util.Random;
import java.util.Scanner;

public class BankProject {
    private int accountNumber;
    private double balance;
    

        public BankProject() {
            Random random = new Random();
            // Generate a random account number between 10000 and 99999
            accountNumber = random.nextInt(90000) + 10000;
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter balance");
            String balance = myObj.nextLine();  // Read user input
            System.out.println("Account number is " + accountNumber);
            System.out.println("Balance is " + balance);
        }

        public int getAccountNumber() {
            return accountNumber;
}

}

class BankTest extends BankProject {
    public BankTest() {
        super();
    }

    public void displayAccountNumber() {
            System.out.println("Account number is " + getAccountNumber());
    }

}
