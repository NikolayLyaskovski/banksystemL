package com.advance.bank.bank.system.service;

import com.advance.bank.bank.system.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    void createAccount();

    void updateAccount();

    List<Account> getAllAccounts();

    Account getAccountById(Long accountId);

    void deleteAccountById(long accountId);
}
