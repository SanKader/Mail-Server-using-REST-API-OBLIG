package com.example.oblig1_var2024.Service;

import com.example.oblig1_var2024.Model.User;
import com.example.oblig1_var2024.Repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) { //Retrives user by ID
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }

    @Override
    public List<User> getAllUsers() { //Fetches all users
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) { // deletes specific user by id
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long id, User userDetails) { // updates existing user
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(userDetails.getUsername());
                    user.setEmail(userDetails.getEmail());
                    user.setPassword(userDetails.getPassword());
                    // Update additional fields as needed
                    return userRepository.save(user);
                }).orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }


}