package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void game() {
        Cli.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        final int maxCount = 3;

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            final int number1 = (int) ((Math.random() * 100) + 1);
            final int number2 = (int) ((Math.random() * 100) + 1);
            int result = gcd(number1, number2);

            System.out.println("Question: " + number1 + " " + number2);
            int answerNext = answer.nextInt();

            if (Engine.correctOrNot(answerNext == result, result, answerNext)) {
                break;
            }

            count++;
        }

        Engine.congratulations(count == maxCount);

    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
