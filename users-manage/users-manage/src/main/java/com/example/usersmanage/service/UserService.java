package com.example.usersmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usersmanage.User;
import com.example.usersmanage.DAO.UserDAO;

@Service
public class UserService {
    @Autowired
    UserDAO userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public String addUser(User user) {
        userDao.save(user);
        return "success";
    }

    public List<User> getUserByLanguage(String language) {
        return userDao.findByLanguage(language);
    }
    
}
