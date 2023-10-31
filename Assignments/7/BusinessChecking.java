public abstract class BusinessChecking extends BusinessAccount{
    public final double monthlyfee = 20;
    public double fee = 10;
    public double nofee = 0;

    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); 
    }
    
    public double Mfee(){
        return monthlyfee;

    }

    public double Withdrawlfee(double amount){
        if(amount >= 10000){                
            return fee;
        }
        else {
            return nofee;
        }
    }
    
    public double Interest(double amount){
        return nofee;
    }

}