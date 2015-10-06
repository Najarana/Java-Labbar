package com.company.boats;

/**
 * Created by Marco on 2015-10-06.
 */
public class Penta implements Engine{

    @Override
    public void startEngine() {
    System.out.println("Motor running");
    }

    @Override
    public boolean runnable() {
        return true;
    }

}
