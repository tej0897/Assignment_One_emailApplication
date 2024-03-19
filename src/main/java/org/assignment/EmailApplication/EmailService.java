package org.assignment.EmailApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private Datasource datasource;

    @Autowired
    public EmailService(Datasource datasource){
        this.datasource = datasource;
    }

    public void sendEmails(){
        String[] emails = datasource.getEmails();

        for (String email: emails){
            System.out.println(email);
        }
    }
}
