class Account {
    String name;
    int accountNumber;

    public Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    public PremiumSavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

public class Exp4_BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Alice", 1001);
        CurrentAccount ca = new CurrentAccount("Bob", 1002);
        PremiumSavingsAccount psa = new PremiumSavingsAccount("Charlie", 1003);

        System.out.println("=== Savings Account ===");
        sa.displayDetails();
        
        System.out.println("\n=== Current Account ===");
        ca.displayDetails();

        System.out.println("\n=== Premium Savings Account ===");
        psa.displayDetails();
    }
}