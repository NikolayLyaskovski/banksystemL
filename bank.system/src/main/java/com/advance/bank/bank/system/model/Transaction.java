package com.advance.bank.bank.system.model;

import com.advance.bank.bank.system.model.enums.TransactionStatus;

import java.time.Instant;

public class Transaction {

    private Long id;
    private Account sender;
    private Account receiver;
    private String description;
    private Instant dateCreated;
    private Instant dateCompleted;
    private Instant dataUpdated;
    private TransactionStatus transactionStatus = TransactionStatus.NEW;
    private Long fee;
    private Long amount;

    public Long getId() {
        return id;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Instant getDataUpdated() {
        return dataUpdated;
    }

    public void setDataUpdated(Instant dataUpdated) {
        this.dataUpdated = dataUpdated;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
