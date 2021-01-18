package com.company;

import java.util.ArrayList;

public class Group  {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Group(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return name + " : students = " + students;
    }
}
