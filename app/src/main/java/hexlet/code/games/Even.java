package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGreeting() {
        String[][] answers = questions();
        Engine.runEngine(QUESTION, answers);
    }

    private static String[][] questions() {
        String[][] questions = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNum(Engine.STARTLIMIT, Engine.ENDLIMIT);
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
