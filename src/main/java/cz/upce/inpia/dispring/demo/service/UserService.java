package cz.upce.inpia.dispring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    EmailService emailService;

    public void createAccount(){
        System.out.println("Account Created");
        emailService.sendEmail();
    }
}
