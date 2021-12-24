package Hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] list = {"java", "kotlin", "python", "javascript"};

        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(list.length);
        String word = list[randomInt];

        StringBuilder secret_w = new StringBuilder(word.substring(0, 2));
        for (int i = 0; i < word.length() - 2; i++){
            secret_w.append('-');
        }

        System.out.println("HANGMAN");
        System.out.printf("Guess the word %s:", secret_w);
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
