package com.company.business.concretes;

import com.company.business.abstracts.AuthService;
import com.company.core.UserAuthService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthManager implements AuthService {

    private UserDao userDao;
    private UserAuthService userAuthService;

    public AuthManager(UserDao userDao, UserAuthService userAuthService) {
        this.userDao = userDao;
        this.userAuthService = userAuthService;
    }

    @Override
    public void login(User user) {
        if(checkEmailAndPassword(user.getEmail(), user.getPassword())){
            userAuthService.accountVerify(user);
        }
    }

    @Override
    public void register(User user) {
        if(!validate(user)) {
            System.out.println("Register didn't finish please check your data");
            return;
        }
        userDao.add(user);
        sendVerificationEmail(user);
    }

    private final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private final Pattern VALID_PASSWORD_REGEX =
            Pattern.compile(".{6,}", Pattern.CASE_INSENSITIVE);

    private boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    private boolean validatePassword(String passwordStr) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(passwordStr);
        return matcher.find();
    }

    public boolean checkName(String firstName) {
        return firstName.length() > 2;
    }

    public boolean checkLastName(String lastName) {
        return lastName.length() > 2;
    }

    public boolean validate(User user) {
        if(validateEmail(user.getEmail()) && validatePassword(user.getPassword()) && checkName(user.getName()) && checkLastName(user.getLastName()) && checkDupUser(user)) {
            return true;
        }
        System.out.println("Please enter according to do restrictions");
        return false;
    }

    public void sendVerificationEmail(User user) {
        System.out.println("Click link for verification" + user.getName());
    }

    private boolean checkEmailAndPassword(String email, String password){
        if(!email.isEmpty() && !password.isEmpty()){
            return true;
        }
        System.out.println("Email or password can not be empty!");
        return false;
    }

    public boolean checkDupUser(User user) {
        return this.userDao.getUserInfoByEmail(user.getEmail()) == null;
    }
}
