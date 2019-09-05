/*
The following program should allow the user to input as many things as they want until they stop. Each time
it is supposed to repeat with what the user said, can you fix it?

import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();

        while (userInput != "") {
            System.out.println(userInput);
        }

    }
}
 */

import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        String userInput = "";

        System.out.println("Please write what is in your mind");
        //userInput = input.next();

        userInput = input.nextLine();

        while(!userInput.equalsIgnoreCase("quit")){
            System.out.println(userInput);

            System.out.println("\nPlease write what is in your mind");
            System.out.println("Please type \"Quit\" to quit.");
            userInput = input.nextLine();
        }
        input.close();
    }
}
