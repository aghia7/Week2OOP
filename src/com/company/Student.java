package com.company;

public class Student extends Person {
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void learn() {
        System.out.println("learning..");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eating junk food");
    }

    @Override
    public String toString() {
        return getName() + " has gpa=" + gpa;
    }
}

