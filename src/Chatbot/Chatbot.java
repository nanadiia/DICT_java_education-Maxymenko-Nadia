package Chatbot;
import java.util.Scanner;

public class Chatbot {
    public String name;
    public double year;

    public Chatbot (String Name, double Year){
        name = Name;
        year = Year;
    }

    public void printbot(){
        System.out.println("Hello! My name is " + name );
        System.out.println("I was created in " + year );
        System.out.println("Please, remind me your name");

    }

    public static void main(String args[]){
        Chatbot empOne = new Chatbot("Aboba", 2021);
        empOne.printbot();
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        System.out.printf("What a great name you have, %s ", num + "!");
        in.close();
    }
}

