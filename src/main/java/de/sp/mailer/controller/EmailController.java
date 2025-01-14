package de.sp.mailer.controller;

import de.sp.mailer.services.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public void sendMail() throws MessagingException {
       // emailService.sendEmail("ultimate@warrior.sixpack","Netter Biceps", "Hallo Hogan, du bist mal cool gewesen.");
        emailService.sendHtmlEmail();
    }
}