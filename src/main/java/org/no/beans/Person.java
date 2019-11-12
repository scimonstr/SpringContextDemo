package org.no.beans;

public class Person {
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }
}
