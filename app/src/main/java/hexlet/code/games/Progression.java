
package hexlet.code.games;

import java.lang.reflect.Array;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;
import hexlet.code.Generate;
import static hexlet.code.Engine.COUNT;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int SIZEIN = 5;
    private static final int SIZEBOUND = 11;
    private static final int PROGRESSION = 6;

    public static void progressionGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number = Generate.generateNum();
            int step = generateProgressionStep();
            int arraySize = generatorSizes();
            int[] progression = generatorProgressions(number, step, arraySize);
            int indexOfDots = generatorBounds(arraySize);
            String question = generatorQuestions(number, step, indexOfDots, progression);
            int correctAnswer = dataNumber(number, step, indexOfDots, progression);
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndCorrectAnswers;
    }

    private static int dataNumber(int number, int step, int indexOfDots, int[] progression) {
        return (int) Array.get(progression, indexOfDots);
    }

    private static String generatorQuestions(int number, int step, int indexOfDots, int[] progression) {
        String[] result = new String[progression.length];
        for (int i = 0; i < progression.length; i++) {
            result[i] = String.valueOf(progression[i]);
        }
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }

    private static int[] generatorProgressions(int number, int step, int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < result.length; i++) {
            number = number + step;
            result[i] = number;
        }
        return result;
    }

    private static int generatorSizes() {
        return Generate.generaNum(SIZEIN, SIZEBOUND);
    }

    private static int generateProgressionStep() {
        int origin = 2;
        return Generate.generaNum(origin, PROGRESSION);
    }

    private static int generatorBounds(int arraySize) {
        int origin = 2;
        int dotesBound = arraySize;
        return Generate.generaNum(origin, dotesBound);
    }
}

