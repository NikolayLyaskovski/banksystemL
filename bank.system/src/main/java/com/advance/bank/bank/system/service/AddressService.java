package com.advance.bank.bank.system.service;

import com.advance.bank.bank.system.model.Address;

import java.util.List;

public interface AddressService {
    void createAddresses(Address address);

    void updateAddress(Address address);

    Address getAddressById(Long addressId);

    List<Address> getAllAddresses();

    void deleteAddressById(Long addressid);


}
