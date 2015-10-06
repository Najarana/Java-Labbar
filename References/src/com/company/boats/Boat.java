package com.company.boats;

/**
 * Created by Marco on 2015-10-06.
 */
public abstract class Boat {
    protected String kieell;
    private long length;


    public Boat(long length, String kieell) {
        this.kieell = kieell;
        if (length > 100) {
            this.length = 100;
        } else if (length < 10) {
            this.length = 10;
        } else {
            this.length = length;
        }
    }

    public Boat() {
        this.length = 19;
        this.kieell = "Röd";
    }


    public String getKieell() {
        return kieell;
    }

    public void printBoat() {
        System.out.println(kieell + " - " + length);
    }

    public abstract boolean tryCastLoss();

}

