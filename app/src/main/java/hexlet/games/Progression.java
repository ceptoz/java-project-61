package hexlet.games;

public class Progression {
    static String[] createArithmeticProgression() {
        String[] numericalRow = new String[BasicLogic.getRandomFromFiveToTen()];
        int firstMember = BasicLogic.getRandomIntDigit();
        int difference = BasicLogic.getRandomIntDigit() + 1;
        numericalRow[0] = Integer.toString(firstMember);

        for (int i = 1; i < numericalRow.length; i++) {
            numericalRow[i] = Integer.toString(firstMember + (difference * i));
        }
        return numericalRow;
    }
    public static void progressionGameBody() {
        int correctAnswerCounter = 0;
        BasicLogic.gameBegins("What number is missing in the progression?");

        for (int i = 0; i < BasicLogic.getGameRoundsNumber(); i++) {
            String[] progression = createArithmeticProgression();
            int randomMemberToBeChanged = (int) (Math.random() * progression.length);
            String numberToGuess = progression[randomMemberToBeChanged];
            progression[randomMemberToBeChanged] = "..";
            String progressionToPrint = String.join(" ", progression);

            BasicLogic.questionPrint(progressionToPrint);
            String userAnswer = BasicLogic.userInput();
            BasicLogic.inputReminder(userAnswer);

            if (userAnswer.equals(numberToGuess)) {
                correctAnswerCounter = BasicLogic.correctAnswerReaction(correctAnswerCounter);
            } else {
                BasicLogic.wrongAnswerReaction(userAnswer, numberToGuess);
                break;
            }
        }
        BasicLogic.gameCompleted(correctAnswerCounter);
    }
}
