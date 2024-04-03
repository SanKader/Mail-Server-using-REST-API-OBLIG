package com.example.oblig1_var2024.Service;

import com.example.oblig1_var2024.Model.User;

import java.util.List;

public interface UserService {

    User updateUser(Long id, User userDetails); // Updates an existing User with new details
    User getUserById(Long id); // Retrieves a User entity by its ID

    List<User> getAllUsers();   // Retrieves a list of all Users

    void deleteUser(Long id); // Deletes a User entity by its ID
}
