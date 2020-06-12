package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.AccountType;

public class Account {
    Long id;
    String iban;
    User owner;
    Long balance;
    AccountType accountType = AccountType.NONE;

}
