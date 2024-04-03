package com.example.oblig1_var2024.Repository;

import com.example.oblig1_var2024.Model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface MailRepository extends JpaRepository<Email, Long> {

    void deleteById(Long id); // this method deletes an Email entity by its id

    Optional<Email> findById(Long id); // this method finds an Email entity by its id
}
