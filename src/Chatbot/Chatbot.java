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

        System.out.println("Let me guess your age. \n +" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d;that`s a good time to start programming!" , age );
        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = in.nextInt();
        for (int i=0; i <= number; i++){
            System.out.printf( "%d !\n", i);
        }
        System.out.println("Let`s test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1.To repeat a statement multiple times.");
        System.out.println("2.To decompose a program into several small subroutines.");
        System.out.println("3.To determine the execution time of a program.");
        System.out.println("4.To interrupt the execution of a program.");
        while(true){
            int answ = in.nextInt();
            if (answ == 2) {
                System.out.println("Great, you right!\n Goodbye, have a nice day!");
                break;
            }else {
                System.out.println("Please, try again.");
            }
        }
        in.close();

    }
}

