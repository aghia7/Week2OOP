package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\aghia\\IdeaProjects\\test\\Lecture2Project\\src\\com\\company\\input.txt");

        try {
            Scanner sc = new Scanner(file);


            Group group = new Group(2001, "SE 2001");

            while(sc.hasNextLine()) {
                User user = new User(sc.nextInt(),
                        sc.next(), sc.next(), sc.nextDouble());
                group.addUser(user);
            }

            System.out.println(group);

            User user = group.removeUser(7);
            if (user != null) {
                System.out.println("The user that was removed was " + user);
            } else {
                System.out.println("A user was not found!");
            }

            System.out.println("----------------------------");
            System.out.println(group);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
