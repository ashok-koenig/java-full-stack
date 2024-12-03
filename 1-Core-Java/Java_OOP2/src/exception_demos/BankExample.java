package exception_demos;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class BankExample {
    private double balance;
    BankExample(double balance){
        this.balance = balance;
    }
    // Handling exception using try/catch within a method
//    public void withdraw(double amount){
//        try{
//            if(amount>balance){
//                throw new InsufficientBalanceException("Insufficient balance");
//            }
//            balance -=amount;
//            System.out.println("Withdrawal successful. Remaining balance: "+ balance);
//        }catch (InsufficientBalanceException e){
//            System.out.println("InsufficientBalanceException: "+ e.getMessage());
//        }catch (Exception e){
//            System.out.println("Exception: "+ e.getMessage());
//        }
//    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -=amount;
        System.out.println("Withdrawal successful. Remaining balance: "+ balance);
    }

    public static void main(String[] args) {
        BankExample account1 = new BankExample(500);
        try{
            account1.withdraw(100);
            account1.withdraw(500);
        }catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException: "+ e.getMessage());
        }
    }
}
