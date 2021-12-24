package Hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] list = {"java", "kotlin", "python", "javascript"};

        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(list.length);
        String word = list[randomInt];
        System.out.println("HANGMAN");
        System.out.println("Guess the word:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost");
        }
    }
}
