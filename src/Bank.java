import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void openAccount(Account account){
        accounts.add(account);
        System.out.println("Account opened :" + account.getAccountNumber());

    }

    public void closeAccount(String accountNumber){
        Account acc =findAccount(accountNumber);
        if (acc != null){
            System.out.println("Account " + accountNumber+ " closed");
            accounts.remove(acc);

        }
        else{
            System.out.println("Account " +accountNumber+" not found");
        }

    }

    public Account findAccount(String accountNumber){
        for (Account acc: accounts){
            if (acc.getAccountNumber().equals(accountNumber)){
                System.out.println("Account "+accountNumber+" found in the name of " + acc.getaccountHolderName());
                return acc;


            }
        }
        return null;
    }
    public void displayAllAccounts(){
        for (Account acc : accounts){
            System.out.println("-----------------------------------------");
            acc.displayAccountInfo();
        }
    }
}
