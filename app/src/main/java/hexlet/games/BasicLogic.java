package hexlet.games;

import java.util.Scanner;

public class BasicLogic {
    private static String userName;
    private static final int GAME_ROUNDS_NUMBER = 3;
    private static final Scanner CONSOLE_INPUT = new Scanner(System.in);
    private static final int RANDOM_INT_MULTIPLIER = 100;
    private static final int RANDOM_INT_DIGIT_MULTIPLIER = 10;
    private static final int RANGE_FIVE_TO_TEN_MODIFIER = 5;
    private static final int NUMBER_OF_AVAILABLE_OPERATIONS = 3;

    static String greetingsGetUsername() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = CONSOLE_INPUT.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void gameBegins(String rules) {
        userName = greetingsGetUsername();
        System.out.println(rules);
    }
    public static void gameCompleted(int correctAnswerCounter) {
        if (correctAnswerCounter == GAME_ROUNDS_NUMBER) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static String userInput() {
        return CONSOLE_INPUT.nextLine();
    }
    public static int getRandomIntTwoDigits() {
        return (int) (Math.random() * RANDOM_INT_MULTIPLIER);
    }
    public static int getRandomIntDigit() {
        return (int) (Math.random() * RANDOM_INT_DIGIT_MULTIPLIER);
    }
    public static int getRandomFromFiveToTen() {
        return (int) (Math.random() * RANGE_FIVE_TO_TEN_MODIFIER + RANGE_FIVE_TO_TEN_MODIFIER);
    }
    public static void questionPrint(String question) {
        System.out.println("Question: " + question);
    }
    public static void questionPrint(int question) {
        System.out.println("Question: " + question);
    }
    public static void inputReminder(String userInput) {
        System.out.println("Your answer: " + userInput);
    }
    public static int correctAnswerReaction(int correctAnswerCounter) {
        System.out.println("Correct!");
        correctAnswerCounter++;
        return correctAnswerCounter;
    }
    public static void wrongAnswerReaction(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static int getGameRoundsNumber() {
        return GAME_ROUNDS_NUMBER;
    }
    public static int getRandomOptionOfThree() {
        return (int) (Math.random() * NUMBER_OF_AVAILABLE_OPERATIONS);
    }
}
