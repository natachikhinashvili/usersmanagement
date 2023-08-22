package com.example.usersmanage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "appusers")
public class User {
    
    @Id
    private Integer id;
    private String name;
    private String language;

}
