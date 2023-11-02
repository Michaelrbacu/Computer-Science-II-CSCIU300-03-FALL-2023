public abstract class BusinessChecking extends BusinessAccount{
    
    public BusinessChecking(String name, String address, String email, String phone)
    {
        super(name, address, email, phone); //call parent's constructor
    }
    
        public double Withdrawlfee(double amount){
            double fee = 10;
            if (amount >= 10000) {
                return fee;
            }
            return 0;
        }



}

