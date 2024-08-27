package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    static String question;
    public static void game() {
        Cli.greetings();
        System.out.println("What is the result of the expression?");
        int count = 0;
        final int maxCount = 3;
        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            int result = getResult();
            System.out.println(question);
            final int answerNext = answer.nextInt();
            if (Engine.correctOrNot(answerNext == result, result, answerNext)) {
                break;
            }
            count++;
        }
        Engine.congratulations(count == maxCount);
    }
    private static int getResult() {

        final int number1 = (int) (Math.random() * 100);
        final int number2 = (int) (Math.random() * 100);
        final int choiceAction = (int) (Math.random() * 3);
        String action = " + ";
        if (choiceAction == 0) {
            action = " - ";
            question = "Question: " + number1 + action + number2;
            return number1 - number2;
        } else if (choiceAction == 1) {
            action = " * ";
            question = "Question: " + number1 + action + number2;
            return number1 * number2;
        } else {
            question = "Question: " + number1 + action + number2;
            return number1 + number2;
        }
    }
}
