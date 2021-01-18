package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user = new User("Mike", "Tyson");

        user.setEmail("ascasca@ag.com");

        System.out.println(user);

    }
}
