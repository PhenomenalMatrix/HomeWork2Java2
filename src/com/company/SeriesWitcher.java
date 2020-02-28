package com.company;

public class SeriesWitcher implements Printable {
    private String name;
    private int age;
    private String role;

    public SeriesWitcher(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void print() {
        System.out.println( "|| Name: " + " " + getName() + " " + "|| Age: " + getAge() + " " + "|| Role: " + getRole() );
    }
}
