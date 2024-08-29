package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;
import hexlet.code.Generates;

import static hexlet.code.Engine.COUNT;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int GENERATENUMB = 3;
    private static final String[] RANDOMOPERATOR = {"+", "-", "*", "-"};

    public static void calcGreeting() {
        String[][] answers = questions();
        Engine.runEngine(RULES, answers);
    }

    private static String[][] questions() {
        String[][] questionsAndCorrectAnswers = new String[COUNT][2];
        for (int i = 0; i < COUNT; i++) {
            int number1 = Generates.generateNum();
            int number2 = Generates.generateNum();
            String operator = generateOperators();
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

    private static String generateOperators() {
        Random random = new Random();
        int indexOfArray = random.nextInt(GENERATENUMB);
        return RANDOMOPERATOR[indexOfArray];
    }
}
