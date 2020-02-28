package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Geralt").print();
        createObject("Yennifer").print();
        createObject("Ciri").print();

    }

    public static Printable createObject(String className){

        Printable print = null;

        switch (className){
            case "Geralt" :
                print = new Witcher("Geralt", 43, "Mercenary");
                break;
            case "Yennifer":
                print = new Witch("Yennifer",80, "Advisor to the Emperor", "Fire");
                break;
            case "Ciri" :
                print = new ImperatorChild("Ciri", 16, "Beige", "Aggressive");
                break;
        }
        return print;
    }
}
