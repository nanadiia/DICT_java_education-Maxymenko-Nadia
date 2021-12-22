package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = input.nextInt();
        System.out.println("For "+ cups + " cups of coffee you will need:\n");
        int numWater = cups*200;
        System.out.println(numWater + " ml of water\n");
        int numMilk = cups*50;
        System.out.println(numMilk + " ml of milk\n");
        int numBeans = cups*15;
        System.out.println(numBeans + " g of coffee beans\n");
    }
}