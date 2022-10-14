package hexlet.games;

import org.apache.commons.math3.primes.Primes;

public class Prime {
    public static void primeGameBody() {
        int correctAnswerCounter = 0;
        BasicLogic.gameBegins("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < BasicLogic.getGameRoundsNumber(); i++) {
            int randomInt = BasicLogic.getRandomIntTwoDigits();

            BasicLogic.questionPrint(randomInt);
            String userAnswer = BasicLogic.userInput();
            BasicLogic.inputReminder(userAnswer);

            if (
                    (Primes.isPrime(randomInt) && userAnswer.equalsIgnoreCase("yes"))
                            || (!Primes.isPrime(randomInt) && userAnswer.equalsIgnoreCase("no"))
            ) {
                correctAnswerCounter = BasicLogic.correctAnswerReaction(correctAnswerCounter);
            } else if (Primes.isPrime(randomInt) && !userAnswer.equalsIgnoreCase("yes")) {
                BasicLogic.wrongAnswerReaction(userAnswer, "yes");
                break;
            } else if (!Primes.isPrime(randomInt) && !userAnswer.equalsIgnoreCase("no")) {
                BasicLogic.wrongAnswerReaction(userAnswer, "no");
                break;
            }
        }
        BasicLogic.gameCompleted(correctAnswerCounter);
    }
}
