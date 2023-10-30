public abstract class BusinessSaving extends BusinessAccount{
    public final double interestrate = .025;
    //constructor
    public BusinessSaving(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }
    
    public void interestRate()
    {
        balance *= interestrate;
    }


    public double fee(){
        double fee = 10;
        return fee;

    }


}