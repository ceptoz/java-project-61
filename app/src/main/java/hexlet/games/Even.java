package hexlet.games;

public class Even {
    public static void evenGameBody() {
        BasicLogic.gameBegins("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswerCounter = 0;

        for (int i = 0; i < BasicLogic.getGameRoundsNumber(); i++) {
            int randomInt = BasicLogic.getRandomIntTwoDigits();

            BasicLogic.questionPrint(randomInt);
            String userAnswer = BasicLogic.userInput();
            BasicLogic.inputReminder(userAnswer);

            if (
                    ((randomInt % 2 == 0) && userAnswer.equalsIgnoreCase("yes"))
                            || ((randomInt % 2 != 0) && userAnswer.equalsIgnoreCase("no"))
            ) {
                correctAnswerCounter = BasicLogic.correctAnswerReaction(correctAnswerCounter);
            } else if ((randomInt % 2 == 0) && !userAnswer.equalsIgnoreCase("yes")) {
                BasicLogic.wrongAnswerReaction(userAnswer, "yes");
                break;
            } else if ((randomInt % 2 != 0) && !userAnswer.equalsIgnoreCase("no")) {
                BasicLogic.wrongAnswerReaction(userAnswer, "no");
                break;
            }
        }
        BasicLogic.gameCompleted(correctAnswerCounter);
    }
}
