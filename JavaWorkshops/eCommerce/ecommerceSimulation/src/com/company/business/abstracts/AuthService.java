package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface AuthService {
    void login(User user);
    void register(User user);
}
