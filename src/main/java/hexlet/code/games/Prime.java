package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {

    static final List<Integer> PRIME_NUMBERS = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137,
            139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199));

    public static void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 0;
        final int maxCount = 3;
        String currentAnswer = "yes";

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);

            final int question = (int) (Math.random() * 199);
            final boolean checkAnswer = PRIME_NUMBERS.contains(question);

            System.out.println("Question: " + question);
            String answerNext = answer.next();

            if (!(checkAnswer)) {
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
