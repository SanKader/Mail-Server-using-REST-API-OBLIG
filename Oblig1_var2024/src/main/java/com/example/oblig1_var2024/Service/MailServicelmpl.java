package com.example.oblig1_var2024.Service;

import com.example.oblig1_var2024.Model.Email;
import com.example.oblig1_var2024.Repository.MailRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MailServicelmpl implements MailService{
    private final MailRepository mailRepository;

    @Autowired
    public MailServicelmpl(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    @Override
    @Transactional
    public void deleteEmail(Long id) {  // Deletes an email entity by its ID
        if (!mailRepository.existsById(id)) {
            throw new EntityNotFoundException("Email with ID " + id + " not found.");
        }
        mailRepository.deleteById(id);
    }

    @Override
    public Email getEmailById(Long id) { // Retrieves an email entity by its ID
        return mailRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Email not found with id: " + id));
    }

    @Override
    public List<Email> getAllEmails() { // Fetches all email
        return mailRepository.findAll();
    }
}
