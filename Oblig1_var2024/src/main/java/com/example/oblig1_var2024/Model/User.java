package com.example.oblig1_var2024.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter; // Lombok annotation to generate getters/setters for all fields.
import lombok.NoArgsConstructor;
import lombok.Setter; // Lombok annotation to generate getters/setters for all fields.

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "application_user")
public class User {

    @Id // Primary key for the entity.
    @GeneratedValue(strategy = GenerationType.AUTO) // Generates ID.
    private long id;

    // The @Column annotation specifies the details of the column to which a field will be mapped in the database.
    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // Parameterized constructor for creating a User instance with values for its fields.
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
