package com.company;

public class MachineIntelligence {
    int[] locCells;
    int numHits = 0;

    public void setLocationcells(int[] locs) {
        locCells = locs;

    }


    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = " Мимо";
        for (int cell : locCells) {
            if (guess == cell) {
                result = "Попал";
                numHits++;
                break;
            }
        }
        if (numHits == locCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}

