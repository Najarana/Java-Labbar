package com.company.boats;

/**
 * Created by Marco on 2015-10-06.
 */
public class Eka extends Boat {
    private String oars;

    public Eka(String oars) {
        super(10, "blue");
        this.oars = oars;
    }

    public String getOars() {
        return oars;
    }

    @Override
    public boolean tryCastLoss(){
        return true;
    }
}
