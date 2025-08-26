public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate ){
        super(accountNumber , accountHolderName, balance);
        this.interestRate = interestRate;
    }
    public void applyInterest(){
        double interest = getBalance() * interestRate/100;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied : Rs. " + interest + " to " +getAccountNumber()+ " Balance is Rs. "+getBalance());
    }

    @Override
    public void withdraw(double amount){
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn Rs." + amount + " from " + getAccountNumber() + " Balance is Rs." +getBalance());
        }
        else{
            System.out.println("Insufficient balance in "+getAccountNumber());
        }
    }
}
