package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT;

public class Calc {
    private static final String RULES = "What is the result of the expression?";

    public static void calcGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number1 = Utils.generateNum();
            int number2 = Utils.generateNum();
            String operator = Utils.generateOperators();
            String question = String.valueOf(number1) + " " + operator + " " + String.valueOf(number2);
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static int calculate(int number1, int number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number1 == 0 || number1 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return number1 / number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
