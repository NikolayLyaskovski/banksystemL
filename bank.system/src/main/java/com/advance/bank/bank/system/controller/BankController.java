package com.advance.bank.bank.system.controller;


import com.advance.bank.bank.system.model.Bank;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    @PostMapping
    public void createBank(@RequestBody Bank bank){

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
