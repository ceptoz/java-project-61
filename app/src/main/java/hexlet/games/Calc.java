package hexlet.games;

public class Calc {
    public static void calcGameBody() {
        int correctAnswerCounter = 0;
        BasicLogic.gameBegins("What is the result of the expression?");

        for (int i = 0; i < BasicLogic.getGameRoundsNumber(); i++) {
            int firstRandomInt = BasicLogic.getRandomIntTwoDigits();
            int secondRandomInt = BasicLogic.getRandomIntTwoDigits();
            int operationResult;
            String randomOperationSign;

            if (BasicLogic.getRandomOptionOfThree() == 0) {
                operationResult = firstRandomInt + secondRandomInt;
                randomOperationSign = "+";
            } else if (BasicLogic.getRandomOptionOfThree() == 1) {
                operationResult = firstRandomInt - secondRandomInt;
                randomOperationSign = "-";
            } else {
                operationResult = firstRandomInt * secondRandomInt;
                randomOperationSign = "*";
            }

            String expression = firstRandomInt + " " + randomOperationSign + " " + secondRandomInt;
            BasicLogic.questionPrint(expression);

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
