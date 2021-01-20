package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class User extends Person {

    private String email;
    private MDate birthday;

    public User(String name, String surname) {
        super(name, surname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validator.checkEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Wrong email!");
        }
    }

    public void setBirthday(String birthday) {
        LocalDate today = LocalDate.now();
        if (Validator.checkDate(birthday)) {
            this.birthday = new MDate(birthday);
        } else {
            System.out.println("Incorrect date");
        }
    }

    @Override
    public String toString() {
        return "User{" + getName() + " " + getSurname() + ", " +
                "email='" + email + '\'' +
                '}';
    }
}
