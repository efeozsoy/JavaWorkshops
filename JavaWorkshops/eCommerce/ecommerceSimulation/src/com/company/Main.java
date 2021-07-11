package com.company;

import com.company.business.concretes.AuthManager;
import com.company.business.concretes.UserManager;
import com.company.core.EmailAuthMe;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

	    User user = new User();
	    user.setId(1);
	    user.setName("Efe");
	    user.setLastName("Özsoy");
	    user.setEmail("efeeozsoy@gmail.com");
	    user.setPassword("12345686");
        UserManager userManager = new UserManager(new HibernateUserDao());
        userManager.add(user);

        AuthManager authManager = new AuthManager(new HibernateUserDao(), new EmailAuthMe());
        authManager.register(user);
        authManager.login(user);

        User user2 = new User();
        user2.setId(2);
        user2.setName("E");
        user2.setLastName("Ö");
        user2.setEmail("efe");
        user2.setPassword("123");

        AuthManager authManager2 = new AuthManager(new HibernateUserDao(), new EmailAuthMe());
        authManager2.register(user2);
        authManager2.login(user2);
    }
}
