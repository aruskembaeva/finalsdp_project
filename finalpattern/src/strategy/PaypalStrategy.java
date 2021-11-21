package strategy;



public class PaypalStrategy implements PaymentStrategy {

        private String emailId;
        private String password;

        public PaypalStrategy(String email, String pwd){
            this.emailId=email;
            this.password=pwd;
        }
    @Override
    public int pay(int amount) {
        System.out.println(" paid using Paypal.");
        return amount;
    }
}
