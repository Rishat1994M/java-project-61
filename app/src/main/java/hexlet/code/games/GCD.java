package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static final int STARTLIMIT = 1;
    public static final int ENDLIMIT = 100;

    public static void gcdGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = Utils.generateNumber(STARTLIMIT, ENDLIMIT);
            int number2 = Utils.generateNumber(STARTLIMIT, ENDLIMIT);
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
