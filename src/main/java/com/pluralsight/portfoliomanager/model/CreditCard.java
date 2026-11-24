package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

// A credit card's balance is how much you owe.
public class CreditCard extends Account {

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void charge(BigDecimal amount) {
        BigDecimal updatedBalance = getBalance().add(amount);
        setBalance(updatedBalance);
    }

    public void pay(BigDecimal amount) {
        BigDecimal updatedBalance = getBalance().subtract(amount);
        setBalance(updatedBalance);
    }

    @Override
    public BigDecimal getValue() {
        return getBalance().negate();
    }
}
