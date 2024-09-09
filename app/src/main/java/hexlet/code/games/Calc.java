package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] RANDOM_OPERATOR = {"+", "-", "*", "-"};
    private static final int GENERATE_NUMBER = RANDOM_OPERATOR.length;
    private static final int COUNT = 3;

    public static void calcGreeting() {
        Utils.setBound(100);
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number1 = Utils.generateNum();
            int number2 = Utils.generateNum();
            String operator = generateOperators();
            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static int calculate(int number1, int number2, String operator) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> {
                if (number2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield number1 / number2;
            }
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }

    public static String generateOperators() {
        int indexOfArray = Utils.generateNumber(0, GENERATE_NUMBER);
        return RANDOM_OPERATOR[indexOfArray];
    }
}
