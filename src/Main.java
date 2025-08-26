//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount("SA0001" , "Manisha" , 10000, 3.5);
        SavingsAccount s2 = new SavingsAccount("SA0002" , "Shruthi" , 11000, 4);

        CheckingAccount c1 = new CheckingAccount("CA0001", "Isiri" , 13000, 1000);
        CheckingAccount c2 = new CheckingAccount("CA0002", "Fatima" , 7000, 2000);

        System.out.println("------------------------");
        System.out.println("Opening account");
        bank.openAccount(s1);
        bank.openAccount(s2);
        bank.openAccount(c1);
        bank.openAccount(c2);

        System.out.println("------------------------");
        System.out.println("Account operations");
        s1.deposit(10000);
        s1.deposit(0);
        s1.applyInterest();
        s2.withdraw(3000);
        s2.withdraw(15000);
        c1.withdraw(3500);
        c2.withdraw(9500);

        System.out.println("------------------------");
        System.out.println("Display all accounts");
        bank.displayAllAccounts();

        System.out.println("------------------------");
        System.out.println("Finding account");
        bank.findAccount("CA0001");

        System.out.println("------------------------");
        System.out.println("Closing accounts");
        bank.closeAccount("SA0001");
        bank.closeAccount("CA0005");
        }
    }
