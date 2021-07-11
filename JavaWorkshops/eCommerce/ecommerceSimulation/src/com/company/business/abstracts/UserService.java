package com.company.business.abstracts;

import com.company.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);

    User getUserInfo(int id, User user);
    User getUserInfoByEmail(String email);
    List<User> getAllUsers();
}
