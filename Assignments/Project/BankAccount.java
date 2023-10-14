package Assignments.Project;
import java.util.Arrays;


class BankAccount {
    private String name;
    private int accountNumber;
    private String address;
    private String emailAddress;
    private String phone;
    private double balance;

    public BankAccount(String name, int accountNumber, String address, String emailAddress, String phone, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount) {
        balance -= amount;
    }


}

class BusinessCheckingAccount extends BankAccount{
public BusinessCheckingAccount(String name, int accountNumber, String address, String emailAddress, String phone, double balance) {
        super(name, accountNumber, address, emailAddress, phone, balance);
    }

}

class BusinessSavingAccount extends BankAccount{
public BusinessSavingAccount(String name, int accountNumber, String address, String emailAddress, String phone, double balance) {
        super(name, accountNumber, address, emailAddress, phone, balance);
    }

}

class PersonalCheckingAccount extends BankAccount{
public PersonalCheckingAccount(String name, int accountNumber, String address, String emailAddress, String phone, double balance) {
        super(name, accountNumber, address, emailAddress, phone, balance);
    }

}

class PersonalSavingAccount extends BankAccount{
public PersonalSavingAccount(String name, int accountNumber, String address, String emailAddress, String phone, double balance) {
        super(name, accountNumber, address, emailAddress, phone, balance);
    }

}