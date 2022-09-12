package com.satish.SpringBootSample.service;

import com.satish.SpringBootSample.dao.UserRepo;
import com.satish.SpringBootSample.model.User;

import org.springframework.beans.factory.annotation.Autowired;

/** 1)Jdbc Template 2) Hibernate 3) Spring data jpa*/

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userDao;

    @Override
    public User saveUser(User user) {
        return null;
    }
}
