package com.example.usersmanage.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.usersmanage.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{
    
    List<User> findByCategory(String category);
    
}
