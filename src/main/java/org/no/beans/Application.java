package org.no.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private Person person;

    public void run() {
        System.out.println(person);
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }
}
