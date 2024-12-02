public class Bank {
    private int accountNumber;
    private String accountName;
    private int accountBalance;
    private static int lastAccountNumber = 1000;

    Bank(String accountName, int accountBalance){
        lastAccountNumber++;
        this.accountNumber = lastAccountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    void deposit(int amount){
        if(amount>0){
            accountBalance+=amount;
            System.out.println(amount+" Deposit successful");
        }else{
            System.out.println("Invalid amount to deposit");
        }
    }
    void withdraw(int amount){
        if(amount<=accountBalance){
            accountBalance -=amount;
            System.out.println(amount + "withdraw successful");
        }else{
            System.out.println("Insufficient balance");
        }
    }

    static void displayLastUsedAccountNumber(){
        System.out.println("Last used account number is "+ lastAccountNumber);
    }

    void displayBalance(){
        System.out.println(accountName+ " with account number "+ accountNumber + " Balance is "+ accountBalance);
    }
}
