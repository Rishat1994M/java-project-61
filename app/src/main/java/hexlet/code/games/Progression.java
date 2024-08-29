
package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

import hexlet.code.Engine;
import hexlet.code.Generates;

import static hexlet.code.Engine.COUNT;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 11;
    private static final int MAX_STEP = 6;
    private static final int MIN_STEP = 2;

    public static void progressionGreeting() {
        String[][] questionsAndAnswers = generateQuestions();
        Engine.runEngine(RULES, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        String[][] questionsAndAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int startNumber = Generates.generateNum();
            int step = Generates.generaNum(MIN_STEP, MAX_STEP);
            int progressionLength = Generates.generaNum(MIN_SIZE, MAX_SIZE);
            int missingIndex = Generates.generaNum(1, progressionLength - 1);
            int[] progression = generateProgressionArray(startNumber, step, progressionLength);
            String question = createQuestion(progression, missingIndex);
            int correctAnswer = progression[missingIndex];

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndAnswers;
    }

    private static String createQuestion(int[] progression, int index) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < progression.length; i++) {
            result.add(i == index ? ".." : String.valueOf(progression[i]));
        }
        return String.join(" ", result);
    }

    private static int[] generateProgressionArray(int startNumber, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = startNumber + i * step;
        }
        return progression;
    }
}
