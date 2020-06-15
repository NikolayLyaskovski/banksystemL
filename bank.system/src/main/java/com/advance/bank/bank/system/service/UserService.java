package com.advance.bank.bank.system.service;

import com.advance.bank.bank.system.model.User;

import java.util.List;

public interface UserService {
   void createUser(User user);      //metodite v interfeisa sa abstractni i nqmat tqlo
   void updateUser(User user);

   User getUserById(Long id);
   List<User> getAllUser();

   void deleteUserById (Long id);
}
