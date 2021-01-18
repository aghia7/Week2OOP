package com.company;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
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

    public void eat() {
        System.out.println("eating normal food");
    }

    public void sleep() {
        System.out.println("sleeping..");
    }
}




