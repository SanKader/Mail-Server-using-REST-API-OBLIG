package com.example.oblig1_var2024.Controller;

import com.example.oblig1_var2024.Model.Email;
import com.example.oblig1_var2024.Repository.MailRepository;
import com.example.oblig1_var2024.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://localhost:8080")
@RestController
@RequestMapping("/api/Email")
public class EmailController {

    private final MailService mailService;

    @Autowired
    MailRepository emailRepository;

    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    // Handles the POST request to create a new Email.
    @PostMapping("/postmail")
    public ResponseEntity<Email> createEmail(@RequestBody Email email) {
        try {
            Email _email = emailRepository
                    .save(new Email(email.getFromEmail(), email.getToEmail(), email.getSubject(), email.getBody(), email.getTimestamp()));
            return new ResponseEntity<>(_email, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Handles GET request to fetch an Email by its ID. The ID is a path variable.
    @GetMapping("/{id}")
    public ResponseEntity<Email> getEmailById(@PathVariable Long id) {
        Email email = mailService.getEmailById(id);
        return new ResponseEntity<>(email, HttpStatus.OK);
    }

    // Handles GET request to fetch all Email entries from the database.
    @GetMapping
    public List<Email> getAllMails() {
        return mailService.getAllEmails();
    }

    // Handles the DELETE request to delete an Email by its ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmail(@PathVariable Long id) {
        mailService.deleteEmail(id);
        return ResponseEntity.ok().build();
    }
}