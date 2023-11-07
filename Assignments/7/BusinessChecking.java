public class BusinessChecking extends BusinessAccount{
    public double fee = 10;
    public double fin = 0;
    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }

        
    @Override
    public boolean withdraw(double amount){
        if((amount+fee)>balance){
            System.out.println("Insufficent funds");
            return false;

        }else if(amount >= 10000){
            fin = amount + fee - balance;
            balance = fin;
            return true;
        }else{
            fin = amount-balance;
            balance = fin;
            return true;
        }

    }

}


