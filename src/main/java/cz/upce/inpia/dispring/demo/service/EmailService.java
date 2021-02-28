package cz.upce.inpia.dispring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public EmailService() {
        System.out.println("EmailService created");
    }

    public void sendEmail(){
        System.out.println("Email sent");
    }
}
