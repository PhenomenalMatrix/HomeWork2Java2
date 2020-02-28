package com.company;

public class Witch extends SeriesWitcher implements Printable {

    private String ability;


    public Witch(String name, int age, String role, String ability) {
        super(name, age, role);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("|| Ability: " + getAbility() );
        System.out.println("______________________________________________");
    }
}
