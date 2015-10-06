package com.company.boats;


/**
 * Created by Marco on 2015-10-06.
 */
public class Uboat extends Boat {

    private Engine engine;

    public Uboat(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean tryCastLoss() {
        if(engine.runnable()){
            engine.startEngine();
            return true;
        }

        System.out.println("Engine is broken");

        return false;

    }
}
