package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class BankAccount extends Account {

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void deposit(BigDecimal amount) {
        BigDecimal newBalance = getBalance().add(amount);
        setBalance(newBalance);
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal newBalance = getBalance().subtract(amount);
        setBalance(newBalance);
    }
}
