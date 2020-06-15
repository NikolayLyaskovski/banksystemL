package com.advance.bank.bank.system.repository;


import com.advance.bank.bank.system.model.contract.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository <Contract, Long> {
}
