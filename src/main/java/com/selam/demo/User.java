package com.selam.demo;

public class User {

    private String name;
    private int age;
    private String message;

    // Constructor
    public User(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMessage() {
        return message;
    }


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMessage(String message) { this.message = message; }

}