package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        final int maxCount = 3;
        String currentAnswer = "yes";

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            final int number = (int) (Math.random() * 10);
            final boolean checkAnswer = number % 2 == 0;

            System.out.println("Question: " + number);
            String answerNext = answer.next();

            if (!(checkAnswer) && number > 0) {
                currentAnswer = "no";
            }

            if (Engine.correctOrNot(answerNext.equals(currentAnswer), currentAnswer, answerNext)) {
                break;
            }

            count++;
            currentAnswer = "yes";
        }


        Engine.congratulations(count == maxCount);
    }

}
