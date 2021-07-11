package com.company.core;

import com.company.entities.concretes.User;
import com.company.googleAuth.GoogleAuthMe;

public class GoogleAuthMeAdapter implements UserAuthService {

    @Override
    public void accountVerify(User user) {
        GoogleAuthMe googleAuthMe = new GoogleAuthMe();
        googleAuthMe.auth(user.getEmail());
    }
}
