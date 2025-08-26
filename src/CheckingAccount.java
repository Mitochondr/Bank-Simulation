public class CheckingAccount extends Account{

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber,accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance() + overdraftLimit){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn Rs. " +amount+ " from "+getAccountNumber()+ " Balance is Rs. " +getBalance());

        }
        else {
            System.out.println("Exceeding overdraft limit. Limit is Rs." + overdraftLimit);
        }
    }



}
