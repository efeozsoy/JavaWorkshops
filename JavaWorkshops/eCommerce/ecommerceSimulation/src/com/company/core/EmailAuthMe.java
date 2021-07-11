package com.company.core;

import com.company.entities.concretes.User;

public class EmailAuthMe implements UserAuthService {

    @Override
    public void accountVerify(User user) {
        System.out.println(user.getName() + " user logged in");
    }
}
