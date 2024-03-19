package org.assignment.EmailApplication;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private Datasource datasource;

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
