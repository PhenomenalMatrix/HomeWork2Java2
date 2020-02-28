package com.company;

public class Witch extends SeriesWitcher implements Printable {

    private String ability;

    public Witch(String name, int age, String role) {
        super(name, age, role);
    }


    public String getAbility() {
        return ability;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("|| Ability: " + getAbility() + " ||");
        System.out.println("______________________________________________");
    }
}
