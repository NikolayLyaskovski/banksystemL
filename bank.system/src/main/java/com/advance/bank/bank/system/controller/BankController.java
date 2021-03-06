package com.advance.bank.bank.system.controller;


import com.advance.bank.bank.system.model.Bank;
import com.advance.bank.bank.system.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    private final BankService bankService;
    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping
    public void createBank(@RequestBody Bank bank){
        bankService.createBank(bank);
    }
    @PutMapping
    public void updateBank(@RequestBody Bank bank){

    }
    @GetMapping
    public List<Bank> getAllBanks(){
        return null;
    }
    @GetMapping ("/{bankId}")
    public Bank getBank(){
        return null;
    }
    @DeleteMapping ("/{bankId}")
    public void deleteBank (@PathVariable Long bankId){

    }
}
