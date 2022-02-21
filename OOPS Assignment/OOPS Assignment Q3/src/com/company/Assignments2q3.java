package com.company;
import java.util.ArrayList;

public class Assignments2q3 {
    public int totalCashInBank(ArrayList<Integer> cash) {
        int availbal = 0;

        for (int i : cash) {
            availbal += 1;
        }

        return availbal;
    }

    public int getCash() {
        return 0;
    }
}
