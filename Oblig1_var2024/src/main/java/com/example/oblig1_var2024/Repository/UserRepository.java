package com.example.oblig1_var2024.Repository;

import com.example.oblig1_var2024.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    void deleteById(Long id);  // delete a User entity by its ID
}
