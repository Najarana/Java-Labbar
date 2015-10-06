package com.company.boats;

/**
 * Created by Marco on 2015-10-06.
 */
public class Sailboat extends Boat {
    private int sailSize;

    public Sailboat(int sailSize, long length) {
        super(length, "green");
        this.sailSize = sailSize;
    }

    public Sailboat(int sailSize) {
        this(sailSize, 29);
    }

    public Sailboat(String kieell) {
        this(74, 29);
        this.kieell = kieell;
    }

    public void makeSailLonger() {
        this.sailSize++;
    }

    @Override
    public void printBoat() {
        System.out.println("Segellängden är " + sailSize);
    }

    @Override
    public boolean tryCastLoss(){
        if(Math.random()>.5){
            return false;
        }

        return true;
    }

}
