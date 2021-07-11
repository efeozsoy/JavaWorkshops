package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User getUserInfo(int id, User user) {
        return null;
    }

    @Override
    public User getUserInfoByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
