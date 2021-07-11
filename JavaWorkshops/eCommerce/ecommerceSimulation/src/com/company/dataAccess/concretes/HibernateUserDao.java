package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("Hibernate used to add " + user.getEmail());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate used to update " + user.getEmail());
    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernate used to delete " + user.getEmail());
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
