package com.company;

import java.util.ArrayList;

public class Group {
    private int id;
    private String name;
    private ArrayList<User> users;

    public Group() {
        users = new ArrayList<>();
    }

    public Group(int id, String name) {
        this();
        setId(id);
        setName(name);
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

    public void addUser(User user) {
        users.add(user);
    }

    public User removeUser(int id) {
        int i = 0;
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(i);
                return user;
            }
            i++;
        }


        return null;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
