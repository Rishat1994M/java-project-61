package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generates;

import static hexlet.code.Engine.COUNT;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void gcdGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number1 = Generates.generateNum();
            int number2 = Generates.generateNum();
            String question = (number1) + " " + (number2);
            String correctAnswer = String.valueOf(find(number1, number2));
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static int find(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return find(number2, number1 % number2);
    }
}
