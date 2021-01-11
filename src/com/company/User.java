package com.company;

public class User {
    private int id;
    private String name;
    private String surname;
    private double gpa;

    public User() {

    }

    public User(int id, String name, String surname, double gpa) {
        setId(id);
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + ", with GPA " + gpa;
    }
}
