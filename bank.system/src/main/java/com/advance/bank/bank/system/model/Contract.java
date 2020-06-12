package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.ContractType;

import java.time.Instant;

public class Contract {

    private Long id;
    private Account account;
    private Instant expiresOn;
    private Instant dateCreated;
    private Object contractDetails;


}
