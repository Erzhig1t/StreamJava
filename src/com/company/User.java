package com.company;

import java.time.LocalDate;

public class User {
    private String name;
    private int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocalDate() {
        return year;
    }

    public void setLocalDate(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", localDate=" + year +
                '}';
    }
}
