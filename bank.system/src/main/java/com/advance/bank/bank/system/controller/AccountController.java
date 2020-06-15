package com.advance.bank.bank.system.controller;


import com.advance.bank.bank.system.model.Account;
import com.sun.prism.shader.DrawEllipse_LinearGradient_REFLECT_AlphaTest_Loader;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @PostMapping
    void createAccount(@RequestBody Account account){

    }

    @PutMapping
    void updateAccount(@RequestBody Account account){

    }

    @GetMapping
    List<Account> getAccounts(){
        return null;
    }

    @GetMapping("/{accountId}")
    Account getAccount(@PathVariable("accountId") Long accountId){
        return null;
    }

    @DeleteMapping
    void deleteAccount(){

    }
}

