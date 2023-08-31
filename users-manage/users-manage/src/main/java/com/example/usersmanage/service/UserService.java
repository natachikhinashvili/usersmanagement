package com.example.usersmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usersmanage.AppConfig;
import com.example.usersmanage.User;
import com.example.usersmanage.DAO.UserDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Service
public class UserService {
    @Autowired
    UserDAO userDao;
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        User user = context.getBean(User.class);
        System.out.println("Name: " + user.getName());
        System.out.println("Language: " + user.getLanguage());
    }

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
