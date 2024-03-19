package org.assignment.EmailApplication;

import org.springframework.stereotype.Component;

@Component
public class MySQLDatasource implements Datasource{

    @Override
    public String[] getEmails() {
        return new String[]{"test1@gmail.com","test2@gmail.com","test3@gmail.com"};
    }
}
