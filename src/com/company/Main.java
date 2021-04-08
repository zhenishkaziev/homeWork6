package com.company;

public class Main {

    public static void main(String[] args) {

        Boss you = new Boss();
        you.setLife(500);
        you.setDamage(60);
        you.setJoin(new Weapon("SteelArms", "NightHunter"));
        System.out.println("Lif of Boss: " + you.getLife() + " " + "Damage of Boss: " + " " + you.getDamage() + " " + "Weapon type: " + " "
                + you.join.getWeaponType() + " " + "Weapon name: " + " " + you.join.getWeaponName());
    }
}
