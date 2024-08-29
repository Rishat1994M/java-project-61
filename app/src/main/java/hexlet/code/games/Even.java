package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generates;

import static hexlet.code.Engine.COUNT;

public class Even {
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGreeting() {
        String[][] answers = questions();
        Engine.runEngine(QUESTION, answers);
    }

    private static String[][] questions() {
        String[][] questions = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number = Generates.generateNum();
            String question = String.valueOf(number);
            String correctAnswer = isEven(number) ? "yes" : "no";
            questions[i][0] = question;
            questions[i][1] = correctAnswer;
        }
        return questions;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
