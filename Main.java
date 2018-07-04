package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numOfGuesses = 0;

        UserEnter Numb = new UserEnter();

        MachineIntelligence fixcells = new MachineIntelligence();

        int randomNum = (int) (Math.random() * 5);
        int[] loactions = {randomNum, randomNum = 1, randomNum + 2};

        fixcells.setLocationcells(loactions);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = Numb.getUserInput("Вводите Число");

            String result = fixcells.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("Попал")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

    }
}
