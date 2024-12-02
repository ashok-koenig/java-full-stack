public class BankDemo {
    public static void main(String[] args) {
        Bank acount1 = new Bank( "John Peter", 1000);
        acount1.displayBalance();
        acount1.deposit(500);
        acount1.displayBalance();
//        acount1.accountBalance = 10000;
        acount1.withdraw(100);
        acount1.displayBalance();

        Bank acount2 = new Bank( "John Smith", 2000);
        acount2.displayBalance();

        Bank.displayLastUsedAccountNumber();
    }
}
