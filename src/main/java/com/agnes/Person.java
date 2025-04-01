package com.agnes;

public class Person {
    //creates fields
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //create constructors for fields

    public Person(String firstName, String lastName, String email) {
        if (firstName == null || firstName.trim().isEmpty() ||
                lastName == null || lastName.trim().isEmpty() ||
                email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("First name, last name and email  are not allowed to be null or empty");
        }
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getters  for Id
    public int getId() {
        return id;
    }

    //getters for firstname
    public String getFirstName() {
        return firstName;
    }

    //setters for firstname
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty())
            throw new IllegalArgumentException("First Name it not allowed to be null or empty");
        this.firstName = firstName;
    }

    //getters for lastname
    public String getLastName() {
        return lastName;
    }

    //setters for lastname
    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty())
            throw new IllegalArgumentException("Last Name is not allowed to be null or empty");
        this.lastName = lastName;
    }

    //getters for email
    public String getEmail() {
        return email;
    }

    //setters for email
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty())
            throw new IllegalArgumentException("Email is not allowed to be null or empty");
        this.email = email;
    }

    // Method to get a summary of the Person object using StringBuilder
    public String getSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("id: ").append(id)
                .append(", name: ").append(firstName).append(" ").append(lastName)
                .append(", email: ").append(email);
        return summary.toString();
    }

    @Override
    public String toString() {
        return getSummary();
    }
}
