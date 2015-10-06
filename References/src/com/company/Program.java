package com.company;

import com.company.boats.*;

public class Program {

    public void runMainMenu() {
        System.out.println("- Running -");

        Sailboat seglare = new Sailboat(54);
        Sailboat flytmaskin = new Sailboat(45);
        Eka eka = new Eka("Fina");

        Boat[] myBoats = {seglare, flytmaskin, eka};
        Sailboat[] mySailboats = {seglare, flytmaskin};
        fixSails(mySailboats);

        for (int i = 0; i < myBoats.length; i++) {
            myBoats[i].printBoat();
        }

    }


    public void fixSails(Sailboat[] boats) {

        for (Sailboat boat : boats) {
            boat.makeSailLonger();
        }
    }

}