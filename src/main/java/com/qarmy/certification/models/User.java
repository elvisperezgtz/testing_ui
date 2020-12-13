package com.qarmy.certification.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;


public class User {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String password;



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
