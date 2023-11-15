/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author AIC
 */
public class Driver {
    public static void main(String[] arg)
    {
        MaintainAccounts test = new MaintainAccounts();
        BankAccount acc = new BusinessChecking("BC","Hello St.","a@abc.edu","555-555-55555");
        test.newaccount(acc);
        acc.deposit(5000);
        acc = new BusinessSaving("BS","Hello St.","a@abc.edu","555-555-55555");
        test.newaccount(acc);
        acc.deposit(4000);
        acc = new PersonalChecking("PC","Hello St.","a@abc.edu","555-555-55555");
        test.newaccount(acc);
        acc.deposit(3000);
        acc = new PersonalSaving("PS","Hello St.","a@abc.edu","555-555-55555");
        test.newaccount(acc);
        acc.deposit(2000);
        acc = new BusinessChecking("A","Hello St.","a@abc.edu","555-555-55555");
        test.newaccount(acc);
        acc.deposit(1000);
        System.out.println(test);
        
        test.applyfee();
        test.addinterest();
        System.out.println(test);  
    }
}
