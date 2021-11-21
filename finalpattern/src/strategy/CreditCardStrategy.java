package strategy;

public class CreditCardStrategy implements PaymentStrategy {

        private String name;
        private String cardNumber;
        private String cvv;
        private String dateOfExpiry;

        public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
            this.name=nm;
            this.cardNumber=ccNum;
            this.cvv=cvv;
            this.dateOfExpiry=expiryDate;
        }
    @Override
    public int pay(int amount) {
        System.out.println(" paid with credit/debit card");
        return amount;
    }
}
