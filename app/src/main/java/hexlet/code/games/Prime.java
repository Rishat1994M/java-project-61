
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int STARTLIMIT = 1;
    public static final int ENDLIMIT = 100;

    public static void primeGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questions = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(STARTLIMIT, ENDLIMIT);
            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            questions[i][0] = question;
            questions[i][1] = correctAnswer;
        }
        return questions;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
