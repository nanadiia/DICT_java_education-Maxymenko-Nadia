package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = input.nextInt();
        int wa = water / 200;
        int mi = milk / 50;
        int be = beans / 15;
        int x = Math.min(wa, mi);
        int min = Math.min(x, be);

        if (min < cups){
            System.out.println("No, I can make only "+min+" cups of coffee");
        } else if( min == cups){
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int minimum = min - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + minimum + " more than that)");
        }
    }
}