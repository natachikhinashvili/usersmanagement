package com.example.usersmanage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public User userBean(){
        User user = new User();
        user.setName("John");
        user.setLanguage("Python");
        return user;
    }
}
