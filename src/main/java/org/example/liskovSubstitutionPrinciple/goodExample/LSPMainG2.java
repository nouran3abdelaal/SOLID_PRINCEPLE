package org.example.liskovSubstitutionPrinciple.goodExample;

public class LSPMainG2 {
    public static void main(String[] args) {
        // Create instances of StandardAccount and SavingsAccount
        BankAccount standardAccount = new StandardAccount();
        BankAccount savingsAccount = new SavingsAccount();

        // Deposit money into both accounts
        standardAccount.deposit(2000);
        savingsAccount.deposit(2000);

        // Withdraw money from both accounts
        standardAccount.withdraw(1500);
        try {
            savingsAccount.withdraw(1500); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage()); // Output: Withdrawal amount exceeds the limit for savings accounts
        }

        // Print balances
        System.out.println("Standard Account Balance: " + standardAccount.getBalance()); // Output: Standard Account Balance: 500
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance()); // Output: Savings Account Balance: 1500
    }
}
