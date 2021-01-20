package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MDate date = new MDate();
        MDate birthday = new MDate("20/01/2015");

        int years = birthday.getYearsBetween(date);


        System.out.println(years);

    }
}
