package org.example.liskovSubstitutionPrinciple.goodExample;

public class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 1000;

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            throw new UnsupportedOperationException("Withdrawal amount exceeds the limit for savings accounts");
        }
        balance -= amount;
    }
}
