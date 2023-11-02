public abstract class BusinessSaving extends BusinessAccount{
    public double fee = 10;

    //constructor
    public BusinessSaving(String name, String address, String email, String phone, double interestrate)
    {
        super(name, address, email, phone);
        interestrate = .025;
        //call parent's constructor
    }
    


}