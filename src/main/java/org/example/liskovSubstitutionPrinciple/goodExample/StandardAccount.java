package org.example.liskovSubstitutionPrinciple.goodExample;

public class StandardAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
