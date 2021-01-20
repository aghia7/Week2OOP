package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();

        //Found this perfect solution - check it!
        //Without using self-defined MDate
        int years = Period.between(birthDate, currentDate).getYears();

        System.out.println(years);

    }
}
