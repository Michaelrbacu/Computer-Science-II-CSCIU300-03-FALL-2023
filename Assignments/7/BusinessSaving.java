public class BusinessSaving extends BusinessAccount{
    public double fee = 10;
    public double fin = 0;
    public double interestrate = .025;
    //constructor
    public BusinessSaving(String name, String address, String email, String phone, double interestrate)
    {
        super(name, address, email, phone);
        this.setinterestrate(interestrate);
        //call parent's constructor
    }

    @Override
    public boolean withdraw(double amount){
        if((amount+fee)>balance){
            System.out.println("Insufficent funds");
            return false;

        }else{
            fin = balance - (amount+fee);
            balance = fin;
            return true;
        }

    }

}