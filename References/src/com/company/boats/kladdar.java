package com.company.boats;

/**
 * Created by Marco on 2015-10-06.
 */
public class kladdar extends Eka implements Engine {

    public kladdar(String oars) {
        super(oars);
    }

    @Override
    public void startEngine() {

    }

    @Override
    public boolean runnable() {
        return false;
    }
}
