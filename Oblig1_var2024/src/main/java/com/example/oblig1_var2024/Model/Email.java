package com.example.oblig1_var2024.Model;


import lombok.Getter; // Lombok annotation to generate getters/setters for all fields.
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="emailservice")
public class Email {
    public Email() { // Default constructor

    }
    @Id // Primary key for the entity.
    @GeneratedValue(strategy = GenerationType.AUTO) // Generates ID.
    private Long id;

    // The @Column annotation specifies the details of the column to which a field will be mapped in the database.
    @Column(name = "subject")
    private String subject;

    @Column(name = "fromEmail")
    private String fromEmail;

    @Column(name = "toEmail")
    private String toEmail;

    @Column(name = "body")
    private String body;

    @Column(name = "timestamp")
    private String timestamp;

    // Custom constructor to easily create an Email instance with its fields initialized.
    public Email(String fromEmail, String toEmail, String subject, String body, String timestamp) {
        this.fromEmail = fromEmail;
        this.toEmail = toEmail;
        this.subject = subject;
        this.body = body;
        this.timestamp = timestamp;
    }

}
