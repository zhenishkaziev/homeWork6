package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        Boss you = new Boss();
        you.setLife(500);
        you.setDamage(60);
        Weapon join = new Weapon();
        join.setWeaponName("SteelArms");
        join.setWeaponType("NightHunter");
        System.out.println("Жизнь босса " + " " + you.getLife()+ " " +"Урон босса " + you.getDamage() + " "
                + "Название оружие " + " " + join.getWeaponName() + " " +  "Тип оружия" + " " + join.getWeaponType());







    }
}
