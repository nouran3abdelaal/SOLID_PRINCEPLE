package org.example.liskovSubstitutionPrinciple.goodExample;

public abstract class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

