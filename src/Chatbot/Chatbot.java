package Chatbot;

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

    }

    public static void main(String args[]){
        Chatbot empOne = new Chatbot("Aboba", 2021);
        empOne.printbot();
    }
}

