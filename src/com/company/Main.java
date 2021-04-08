package com.company;

public class Main {

    public static void main(String[] args) {

        Boss you = new Boss();
        you.setLife(500);
        you.setDamage(60);
        you.setJoin(new Weapon("SteelArms", "NightHunter"));
        System.out.println("Lif of Boss: " + you.getLife() + " " + "Damage of Boss: " + " " + you.getDamage() + " " + "Weapon type: " + " "
                + you.join.getWeaponType() + " " + "Weapon name: " + " " + you.join.getWeaponName());

        System.out.println(you.printInfo());
        Sceleton uper = new Sceleton();
        uper.setLife(120);
        uper.setDamage(30);
        Sceleton uper1 = new Sceleton();
        uper1.setLife(100);
        uper1.setDamage(25);
        System.out.println("Жизнь " + " " +  uper.getLife() + " "+ "Урон " + " " +  uper.getDamage()+ " " +"Cтрелы " + " " + uper.getArrows());
        System.out.println("Жизнь Скелета " + uper1.getLife() + " " + "Урон скелета " +" "+ uper1.getDamage() + " " + "Кол стрел" + " " + uper1.getArrows());

    }
}
