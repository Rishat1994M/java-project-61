package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int startNumber = Utils.generateNum(Engine.STARTLIMIT, Engine.ENDLIMIT);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
            int progressionLength = Utils.generateNumber(MIN_SIZE, MAX_SIZE);
            int missingIndex = Utils.generateNumber(0, progressionLength - 1);

            String[] progression = makeProgression(startNumber, step, progressionLength);
            String answer = progression[missingIndex];

            progression[missingIndex] = "..";
            String question = String.join(" ", progression);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        return questionsAndAnswers;
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
