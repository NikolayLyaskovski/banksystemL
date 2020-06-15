package com.advance.bank.bank.system.controller;


import com.advance.bank.bank.system.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    @PostMapping
    public void createAddress(@RequestBody Address address){
    }
    @PutMapping
    public void updateAddress(@RequestBody Address address){

    }
    @GetMapping
    public List<Address> getAllAddresses(){
        return  null;
    }

    @GetMapping("/{addresId}")
    public Address getAddress(Long addressId){
        return null;
    }

    @DeleteMapping
    public void deleteAddress(@PathVariable("addressId") Long addressId){

    }
}
