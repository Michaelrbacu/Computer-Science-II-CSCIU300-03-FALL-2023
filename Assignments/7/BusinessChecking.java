public abstract class BusinessChecking extends BusinessAccount{
    public final double monthlyfee = 20; //monthly fee
    //constructor
    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }
    
    public double Mfee(){
        double fee = 20;
        return fee;

    }

        public double Wfee(double amount){
        
            if(amount >=10000){
            double fee = 10;
            return fee;

            }
            else{            
                return 0;
            }
        

    }



}

