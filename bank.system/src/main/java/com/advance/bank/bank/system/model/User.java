package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.UserType;

import java.util.List;
import java.util.Set;

public class User {

    private Long id;
    private UserType userType;
    private Set<Account> accounts;
    private String firstName;
    private String lastName;
    private String egn;
    private String mobileNumber;
    private Set<Object> addresses;
    private String email;
    private String password;

}
