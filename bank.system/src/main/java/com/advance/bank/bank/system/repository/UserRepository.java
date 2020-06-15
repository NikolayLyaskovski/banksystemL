package com.advance.bank.bank.system.repository;

import com.advance.bank.bank.system.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

}
