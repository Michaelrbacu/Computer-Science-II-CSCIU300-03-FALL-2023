public abstract class BusinessChecking extends BusinessAccount{
    public final double monthlyfee = 20; //monthly fee
    //constructor
    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }
    


}