package com.example.adp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//MyPOJO is the an acronym of plain old java object
public class MyPOJO {
    private String firstName;
    private String lastName;
    private long idNumber;
    public MyPOJO(final String firstName,
                  final String lastName,
                  final long idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public long getIdNumber() {
        return this.idNumber;
    }
    // gets poj webpage



}
