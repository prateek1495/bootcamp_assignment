package com.demo.answer9and10;

public class StudentCO {
    String firstname;
    String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        System.out.println("f called");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        System.out.println("l called");
    }
}
