package Hangman;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {
        while (true) {
            System.out.println("HANGMAN");
            System.out.println("Type 'play' to play the game or 'exit'");
            Scanner userInput = new Scanner(System.in);
            String choice = userInput.nextLine();
            if (Objects.equals(choice, "exit")) {
                break;
            }
            else if (Objects.equals(choice, "play")){
                int lives = 8;
                String[] wordsArr = {"java", "kotlin", "python", "javascript"};
                String word = generateWord(wordsArr);
                StringBuilder hiddenWord = hiddenWordGen(word);
                StringBuilder chosenLetters = new StringBuilder("");
                while (true) {

                    if (lives == 0) {
                        System.out.println("You lost!");
                        break;
                    } else {
                        if (hiddenWord.indexOf("-") != -1) {
                            System.out.printf("Input a letter %s:", hiddenWord);
                            String answer = userInput.nextLine();
                            if (checker(answer, chosenLetters)) {
                                chosenLetters.append(answer);
                                if (!word.contains(answer)) {
                                    System.out.println("The letter doesn't appear in word");
                                    --lives;
                                } else {
                                    hiddenWord = updateHiddenWord(hiddenWord, answer, word);
                                }
                            }
                        } else {
                            System.out.println(hiddenWord);
                            System.out.println("You win!");
                            break;
                        }
                    }
                }
            }

        }
    }
    public static String generateWord(String[] wordsList) {
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(wordsList.length);
        return wordsList[randomInt];
    }

    public static StringBuilder hiddenWordGen(String word) {
        StringBuilder hiddenWord = new StringBuilder("");
        hiddenWord.append("-".repeat(word.length()));
        return hiddenWord;
    }

    public static StringBuilder updateHiddenWord(StringBuilder secretWord, String answer, String  word) {
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

    public static Boolean checker(String answer, StringBuilder chosen_letters) {
        String letters = "qwertyuiopasdfghjklzxcvbnm";
        if (answer.length() != 1) {
            System.out.println("You should enter one letter");
            return false;
        }
        else if (!letters.contains(answer)){
            System.out.println("You should enter only english lowercase letters!");
            return false;
        }
        else if (chosen_letters.indexOf(answer) != -1){
            System.out.println("You already choose that letter");
            return false;
        }
        else {
            return true;
        }


    }
}