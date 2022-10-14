package hexlet.code;

import static hexlet.code.Engine.enterAnOptionNumber;
import static hexlet.code.Engine.optionStart;

public class App {
    public static void main(String[] args) {
        String[] menu = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
        int userOption;

        System.out.println("Please enter the game number and press Enter.");
        for (String option : menu) {
            System.out.println(option);
        }
        userOption = enterAnOptionNumber();
        optionStart(userOption);
    }
}
