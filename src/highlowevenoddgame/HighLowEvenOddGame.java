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
        Scanner stdIn = new Scanner(System.in);
    }// end main

    //This method returns the value of a randomly rolled die.
    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }//end rollDie

}// end HighLowEvenOddGame class
