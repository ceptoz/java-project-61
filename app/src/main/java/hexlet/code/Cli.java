package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner consoleInput = new Scanner(System.in);
        String userName = consoleInput.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
