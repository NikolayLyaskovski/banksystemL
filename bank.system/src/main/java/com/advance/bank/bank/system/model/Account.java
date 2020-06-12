package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.AccountType;

public class Account {
    private Long id;
    private String iban;
    private User owner;
    private Long balance;
    private AccountType accountType = AccountType.NONE;

    public Long getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
