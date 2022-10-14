package hexlet.code;

import hexlet.games.Calc;
import hexlet.games.Even;
import hexlet.games.GCD;
import hexlet.games.Prime;
import hexlet.games.Progression;

import java.util.Scanner;

public class Engine {
    public static int enterAnOptionNumber() {
        Scanner consoleInput = new Scanner(System.in);
        int chosenOption = Integer.parseInt(consoleInput.nextLine());
        System.out.println("Your choice: " + chosenOption);
        return chosenOption;
    }
    public static void optionStart(int option) {
        switch (Integer.toString(option)) {
            case MenuOptions.GREETINGS -> Cli.greetings();
            case MenuOptions.EVEN -> Even.evenGameBody();
            case MenuOptions.CALC -> Calc.calcGameBody();
            case MenuOptions.GCD -> GCD.gameGCDBody();
            case MenuOptions.PROGRESSION -> Progression.progressionGameBody();
            case MenuOptions.PRIME -> Prime.primeGameBody();
            case MenuOptions.EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("There is no such option. Please, type a number from the list");
        }
    }
}
