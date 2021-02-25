package com.services.appworker;

public class User {
    private String name,gender;
    private int phone,ages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public void setGenderM() {
        this.gender = "Male";
    }

    public void setGenderFe() {
        this.gender = "Female";
    }
}
