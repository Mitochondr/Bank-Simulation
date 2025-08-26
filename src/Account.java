public abstract class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0)
        {
            balance = balance + amount;
            System.out.println("Deposited Rs." +amount+ " to account " +getAccountNumber() +" Balance is Rs. " +balance);
        }
        else{
            System.out.println("Deposit amount should be greater than zero");
        }
    }

    public abstract void withdraw(double amount);

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getaccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public void displayAccountInfo(){
        System.out.println("Account number : " + accountNumber);
        System.out.println("Account holder name : " + accountHolderName);
        System.out.println("Balance : Rs." + balance);


    }

}
