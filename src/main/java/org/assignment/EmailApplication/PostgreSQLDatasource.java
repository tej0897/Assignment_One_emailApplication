package org.assignment.EmailApplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDatasource implements Datasource{
    @Override
    public String[] getEmails() {
        return new String[]{"test1@gmail.com","test2@gmail.com","test3@gmail.com"};
    }
}
