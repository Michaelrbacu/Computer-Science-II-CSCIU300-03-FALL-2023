import java.util.Scanner;

public class TestAccounts2 {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Enter the first account holder's name:");
        String name1 = stringScanner.next();
        Account account1 = new Account(100, name1);

        System.out.println("\nEnter the second account holder's name:");
        String name2 = stringScanner.next();
        Account account2 = new Account(100, name2);

        System.out.println("\nEnter the third account holder's name:");
        String name3 = stringScanner.next();
        Account account3 = new Account(100, name3);

        System.out.println("\nCreated accounts:\n");
        System.out.println(account1);
        System.out.println();
        System.out.println(account2);
        System.out.println();
        System.out.println(account3);

        account1.closeAccount();
        System.out.println();
        int numAccounts = Account.getNumAccounts();
        System.out.println("Account 1 status: " + account1);
                System.out.println("\nNumber of accounts: " + numAccounts);

    }
}
