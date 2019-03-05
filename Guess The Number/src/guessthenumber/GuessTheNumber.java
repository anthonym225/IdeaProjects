package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scan = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt(max + 1));
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big.");
            } else if (move < theNumber) {
                System.out.println("Your number is too small.");
            } else {
                System.out.println("You guessed correctly!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("The number is small.");
        } else if (x >= 11 && x <= 100) {
            System.out.println("The number is big.");
        } else {
            System.out.println("The number is out of range.");
        }
    }

    public static void main(String[] args) {
        // write your code here
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Type numbers to guess the number between 0 and " + guessGame.max + " type to get started.");
        guessGame.play();
    }
}
