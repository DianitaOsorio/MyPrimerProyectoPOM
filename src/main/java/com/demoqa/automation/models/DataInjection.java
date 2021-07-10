package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-ES"));
    private String username,email,currentAddress,permanentAddress;



    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
    public DataInjection(){

        this.username = faker.name().fullName();
        this.email = faker.internet().emailAddress();
        this.currentAddress = faker.address().secondaryAddress();
        this.permanentAddress = faker.address().fullAddress();
    }
}

