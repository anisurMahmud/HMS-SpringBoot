package com.hms.model;

import jakarta.persistence.Entity;

@Entity
public class User {
    private long id;
    private String name;
    private short age;
    private String sex;
    private String address;
    private String phnNumber;

    public User(long id, String name, String sex, short age, String address, String phnNumber) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.phnNumber = phnNumber;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }
}
