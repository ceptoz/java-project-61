package hexlet.games;

public class GCD {
    static int findGCD(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return (firstNumber + secondNumber);
    }
    public static void gameGCDBody() {
        int correctAnswerCounter = 0;
        BasicLogic.gameBegins("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < BasicLogic.getGameRoundsNumber(); i++) {
            int firstRandomInt = BasicLogic.getRandomIntTwoDigits() + 1;
            int secondRandomInt = BasicLogic.getRandomIntTwoDigits() + 1;

            String expression = firstRandomInt + " " + secondRandomInt;
            BasicLogic.questionPrint(expression);

            int operationResult = findGCD(firstRandomInt, secondRandomInt);

            String userAnswer = BasicLogic.userInput();
            BasicLogic.inputReminder(userAnswer);

            if (Integer.parseInt(userAnswer) == operationResult) {
                correctAnswerCounter = BasicLogic.correctAnswerReaction(correctAnswerCounter);
            } else {
                BasicLogic.wrongAnswerReaction(userAnswer, Integer.toString(operationResult));
                break;
            }
        }
        BasicLogic.gameCompleted(correctAnswerCounter);
    }
}
