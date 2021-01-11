package com.company;

public class BankAccount {
    private int cents;

    public void deposit(int dollars) {
        cents += dollars * 100;
    }

    public void deposit(int dollars, int cents) {
        this.cents += dollars * 100 + cents;
    }

    public double getDollars() {
        return cents / 100.0;
    }

    @Override
    public String toString() {
        return "The account has " + getDollars() + " dollars!";
    }
}
