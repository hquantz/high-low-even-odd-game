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
        String playAgain = "y"; //stores if the user wants to play again

        System.out.println("High-Low Even-Odd Game by Hunter Quantz\n");

        while (!playAgain.equalsIgnoreCase("n")) {
            System.out.print("Will the next total be High (h) or Low (l)? ");
            highLow = stdInString.next();
            System.out.print("Will the next total be Even (e) or Odd (o)? ");
            evenOdd = stdInString.next();

            die1 = rollDie();
            die2 = rollDie();
            diceTotal = die1 + die2;
            results(diceTotal, evenOdd, highLow);
            System.out.print("Do you want to play again? (y/n) ");
            playAgain = stdInString.next();
        }

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
        } else {
            correctGuess = true;
        }

        return correctGuess;
    }//end rangeTest

    public static boolean evenOddTest(int diceTotal, String evenOdd) {
        boolean correctGuess;

        if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("o")) {
            correctGuess = true;
        } else if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("e")) {
            correctGuess = false;
        } else if (diceTotal % 2 == 0 && evenOdd.equalsIgnoreCase("e")) {
            correctGuess = true;
        } else {
            correctGuess = false;
        }
        return correctGuess;
    }//end evenOddTest

    public static void results(int diceTotal, String evenOdd, String highLow) {
        System.out.printf("The total is %d%n", diceTotal);

        if (diceTotal == 7) {
            System.out.println("It's the dreaded 7, no way to win");
        } else if (evenOddTest(diceTotal, evenOdd) && rangeTest(diceTotal, highLow)) {
            System.out.println("You are totally correct!");
        } else if (!evenOddTest(diceTotal, evenOdd) && rangeTest(diceTotal, highLow)) {
            System.out.println("You are totally wrong!");
        } else if (rangeTest(diceTotal, highLow) && !evenOddTest(diceTotal, evenOdd)) {
            System.out.println("You didn't get the even/odd right");
        } else if (evenOddTest(diceTotal, evenOdd) && !rangeTest(diceTotal, highLow)) {
            System.out.println("You didn't get the range right");
        }
    }

}// end HighLowEvenOddGame class
