package com.advance.bank.bank.system.service;

import com.advance.bank.bank.system.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void createUser(User user);      //metodite v interfeisa sa abstractni i nqmat tqlo

    void updateUser(User user);

    User getUserById(Long id);

    List<User> getAllUser();

    void deleteUserById(Long id);
}
