package com.company;

public final class Witcher extends  SeriesWitcher {

    private int armor;


    public Witcher(String name, int age, String role) {
        super(name, age, role);
    }

    public Witcher(String name, int age, String role, int armor) {
        super(name, age, role);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("|| Armor status (1/10): " + getArmor() + " ||");
        System.out.println("______________________________________________");
    }
}
