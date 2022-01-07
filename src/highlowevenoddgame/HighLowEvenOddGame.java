/*
 * HighLowEvenOddGame.java
 * Hunter Quantz
 * 
 * This program simulates rolling two dice and has the user guess if it will be
 * above or below 7, with 7 always being a loss. The user also guess if the 
 * total will be even or odd.
 */
package highlowevenoddgame;

import java.util.Scanner;

public class HighLowEvenOddGame {

    public static void main(String[] args) {
        Scanner stdInString = new Scanner(System.in);
        String highLow; //stores if the user guesses High or Low
        String evenOdd; //Stores if the user guesses Even or Odd
        int die1, die2;//stores the dice
        int diceTotal; //stores the dice total

        System.out.println("High-Low Even-Odd Game by Hunter Quantz\n");
        System.out.print("Will the next total be High (h) or Low (l)? ");
        highLow = stdInString.next();
        System.out.print("Will the next total be Even (e) or Odd (o)? ");
        evenOdd = stdInString.next();

        die1 = rollDie();
        die2 = rollDie();
        diceTotal = die1 + die2;

    }// end main

    //This method returns the value of a randomly rolled die.
    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }//end rollDie

    public static boolean rangeTest(int diceTotal, String highLow) {
        boolean correctGuess;

        if (diceTotal > 7 && highLow.equalsIgnoreCase("h")) {
            correctGuess = true;
        } else if (diceTotal < 7 && highLow.equalsIgnoreCase(("h"))) {
            correctGuess = false;
        } else if (diceTotal > 7 && highLow.equalsIgnoreCase("l")) {
            correctGuess = false;
        } else if (diceTotal < 7 && highLow.equalsIgnoreCase("l")) {
            correctGuess = true;
        } else {
            correctGuess = false;
        }

        return correctGuess;
    }

}// end HighLowEvenOddGame class
