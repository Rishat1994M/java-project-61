
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generate;
import static hexlet.code.Engine.COUNT;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questions = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number = Generate.generateNum();
            String question = String.valueOf(number);
            String correctAnswer = answer(number);
            questions[i][0] = question;
            questions[i][1] = correctAnswer;
        }
        return questions;
    }

    private static String answer(int number) {
        return isPrime(number) ? "yes" : "no";
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

