package com.company;

public class Boss extends GameEnity {

    Weapon join;


    public Weapon getJoin() {
        return join;
    }

    public void setJoin(Weapon join) {
        this.join = join;

    }
    public String printInfo(){
        return "Жизнь 500" +" " +  "Урон 60";
    }

}

