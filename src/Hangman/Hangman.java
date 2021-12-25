package Hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        String[] wordsList = {"java", "kotlin", "python", "javascript"};
        String word = generateWord(wordsList);
        StringBuilder secretWord = secretWordGen(word);


        System.out.println("HANGMAN");
        int lives = 8;
        while (true) {
            if (lives == 0){
                System.out.println("You lost!");
                break;
            } else {
                if (secretWord.indexOf("-") != -1) {
                    System.out.printf("Input a letter %s:", secretWord);
                    Scanner userInput = new Scanner(System.in);
                    String answer = userInput.nextLine();
                    if (!word.contains(answer)) {
                        System.out.println("The letter doesn't appear in word");
                        --lives;
                    }
                    else {
                        secretWord = updateSecretWord(secretWord, answer, word);
                    }
                } else {
                    System.out.println(secretWord);
                    System.out.println("Thanks for playing!");
                    System.out.println("We'll see how well you did in the next stage");
                    break;
                }
            }

        }
    }

    public static String generateWord(String[] wordsList) {
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(wordsList.length);
        String word = wordsList[randomInt];
        return wordsList[randomInt];
    }

    public static StringBuilder secretWordGen(String word) {
        StringBuilder secretWord = new StringBuilder("");
        secretWord.append("-".repeat(word.length()));
        return secretWord;
    }


    public static StringBuilder updateSecretWord(StringBuilder secretWord, String answer, String word) {
        int index = 0;
        while (index >= 0) {
            index = word.indexOf(answer, index);
            if (index >= 0) {
                secretWord.setCharAt(index, answer.charAt(0));
                ++index;
            }
        }

        return secretWord;
    }
}





