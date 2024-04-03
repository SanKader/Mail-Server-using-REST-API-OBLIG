package com.example.oblig1_var2024.Service;

import com.example.oblig1_var2024.Model.Email;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional // The @Transactional annotation ensures that all methods within this interface
public interface MailService {

    Email getEmailById(Long id); // Method to retrieve an Email entity by its ID

    List<Email> getAllEmails(); // Method to retrieve a list of all Email

    void deleteEmail(Long id); // Method to delete an Email entity by its ID
}
