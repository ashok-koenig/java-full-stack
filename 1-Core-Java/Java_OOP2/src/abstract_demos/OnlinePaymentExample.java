package abstract_demos;

abstract class Payment{
    String accountName;
    Payment(String accountName){
        this.accountName = accountName;
    }
    // Abstract Method: to be implemented by specific payment types
    abstract void processPayment(double amount);

    // Concrete method: Common method for all types of payment.
    void showConfirmation(double amount){
        System.out.println("Payment of "+ amount + " has been processed for "+ accountName);
    }
}

class CreditCardPayment extends Payment{
    private String cardNumber;
    CreditCardPayment(String accountName, String cardNumber) {
        super(accountName);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of "+ amount + " for card number: "+ cardNumber);
    }
}

class PayPalPayment extends Payment{
    private String payPalId;
    PayPalPayment(String accountName, String payPalId) {
        super(accountName);
        this.payPalId = payPalId;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing paypal payment of "+ amount + " for payPalId: "+ payPalId);
    }
}

public class OnlinePaymentExample {
    public static void main(String[] args) {
        // Credit Card Payment
        Payment creditCard = new CreditCardPayment("John Peter", "2343-3433-3434");
        creditCard.processPayment(200);
        creditCard.showConfirmation(200);

        // Paypal Payment
        Payment payPal = new PayPalPayment("John Smith", "paypal-2343");
        payPal.processPayment(400);
        payPal.showConfirmation(400);
    }
}
