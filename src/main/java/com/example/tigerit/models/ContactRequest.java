package com.example.tigerit.models;

import com.sun.istack.NotNull;

public class ContactRequest {
    @NotNull
    private String fullName;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String address;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
