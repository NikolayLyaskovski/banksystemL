package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.CardType;

import java.time.Instant;

public class PhysicalCard {

    private Long id;
    private Integer cardNumber;
    private CardType cardType = CardType.NONE;
    private Instant expirationDAte;
    private Integer cvv;
    private Integer pinCode;
    private Account account;
    boolean isActive = false;

    public Long getId() {
        return id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Instant getExpirationDAte() {
        return expirationDAte;
    }

    public void setExpirationDAte(Instant expirationDAte) {
        this.expirationDAte = expirationDAte;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
