package com.company;

public class Sceleton extends Boss {
        private int arrows = 12;

    public int getArrows() {
        return arrows;
    }
    public String printInfo(){
        return super.printInfo() + arrows;
    }
}
