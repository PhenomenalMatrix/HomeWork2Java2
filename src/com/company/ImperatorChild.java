package com.company;

public class ImperatorChild extends SeriesWitcher {

    private String status;

    public ImperatorChild(String name, int age, String role) {
        super(name, age, role);
    }

    public ImperatorChild(String name, int age, String role, String status) {
        super(name, age, role);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("|| Status: " + getStatus() );
        System.out.println("______________________________________________");
    }
}
