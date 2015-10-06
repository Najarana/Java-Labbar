package com.company;
import com.company.boats.*;
import java.util.ArrayList;

/**
 * Created by Marco on 2015-10-06.
 */
public class StageTwo {
    public StageTwo() {
        System.out.println("- Part Two -");

        Boat anna = new Sailboat(12);
        Boat eka = new Eka("blå");
        Boat[] boats = {anna, eka, new Sailboat(22), new Eka("provar")};
        kastaLoss(boats);

        Engine motor = new Banan20();
        Boat uboat = new Uboat(motor);
        boolean castaSuccess = uboat.tryCastLoss();
    }

    private void kastaLoss(Boat[] boats) {
        ArrayList<Boat> failed = new ArrayList<>();
        for (Boat boat : boats) {
            boolean success = boat.tryCastLoss();
            if (success == false) {
                failed.add(boat);
            }
        }
        int i = 0;
        //gör kod
    }
}


