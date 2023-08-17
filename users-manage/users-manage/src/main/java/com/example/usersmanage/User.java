package com.example.usersmanage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "users")
public class User {
    
    @Id
    private Integer id;
    private String name;
    private String language;

}
